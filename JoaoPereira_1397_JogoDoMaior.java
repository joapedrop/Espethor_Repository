public class JoaoPereira_1397_JogoDoMaior {
    static java.util.Scanner ler = new java.util.Scanner(System.in);

    public static int LerNumIntRodadas() {
        int numero = 0;

        numero = ler.nextInt();

        return numero;
    }

    public static int LerNumIntJogador() {
        int numero = 0;

        numero = ler.nextInt();

        return numero;
    }

    public static void ImprimirJogoeQuemGanhou(int numerodojogador1, int numerodojogador2, int rodadas,
            int qtdvitoriasjogador1, int qtdvitoriasjogador2) {
        while (true) {
            rodadas = LerNumIntRodadas();

            if (rodadas == 0) {
                break;
            }

            for (int i = 0; i < rodadas; i++) {
                numerodojogador1 = LerNumIntJogador();

                numerodojogador2 = LerNumIntJogador();

                if (numerodojogador1 > numerodojogador2) {
                    qtdvitoriasjogador1++;
                } else {
                    if (numerodojogador2 > numerodojogador1) {
                        qtdvitoriasjogador2++;
                    }
                }

            }
            System.out.printf("%d %d\n", qtdvitoriasjogador1, qtdvitoriasjogador2);
        }
    }

    public static void main(String[] args) {
        int numerodojogador1 = 0;
        int rodadas = 0;
        int numerodojogador2 = 0;
        int qtdvitoriasjogador1 = 0;
        int qtdvitoriasjogador2 = 0;

        ImprimirJogoeQuemGanhou(numerodojogador1, numerodojogador2, rodadas, qtdvitoriasjogador1, qtdvitoriasjogador2);
    }
}
