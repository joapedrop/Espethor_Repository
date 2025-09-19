public class JoaoPereira_2189_Quermesse {
    static java.util.Scanner ler = new java.util.Scanner(System.in);

    public static int LerNumInt() {
        int numero = 0;

        numero = ler.nextInt();

        return numero;
    }

    public static void ImprimirNumeroIgualPosicao(int qtddeparticipantes, int numeroescolhidopeloparcipante,
            int numeroigualaposicao) {
        int teste = 0;
        while (true) {
            if (qtddeparticipantes != 0) {
                teste++;

                numeroigualaposicao = 0;

                qtddeparticipantes = LerNumInt();

                if (qtddeparticipantes == 0) {
                    break;
                }

                for (int i = 1; i <= qtddeparticipantes; i++) {
                    numeroescolhidopeloparcipante = LerNumInt();

                    if (numeroescolhidopeloparcipante == i) {
                        numeroigualaposicao = numeroescolhidopeloparcipante;
                    }
                }

                System.out.printf("Teste %d\n%d\n\n", teste, numeroigualaposicao);
            }

        }
    }

    public static void main(String[] args) {
        int qtddeparticipantes = 1;
        int numeroescolhidopeloparcipante = 0;
        int numeroigualaposicao = 0;

        ImprimirNumeroIgualPosicao(qtddeparticipantes, numeroescolhidopeloparcipante, numeroigualaposicao);
    }
}