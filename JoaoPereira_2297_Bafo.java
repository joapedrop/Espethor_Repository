public class JoaoPereira_2297_Bafo {

    static java.util.Scanner ler = new java.util.Scanner(System.in);

    public static int LerNumInt() {
        int numero = 0;

        numero = ler.nextInt();

        return numero;
    }

    public static void Imprimirovencedordobafo(int jogadadoaldo, int jogadadobeto, int rodadas, int pontosaldo,
            int pontosbeto, int testes) {

        while (rodadas != 0) {
            testes++;
            rodadas = LerNumInt();

            if (rodadas != 0) {

                for (int i = 0; i < rodadas; i++) {
                    jogadadoaldo = LerNumInt();

                    jogadadobeto = LerNumInt();

                    pontosaldo = pontosaldo + jogadadoaldo;

                    pontosbeto = pontosbeto + jogadadobeto;
                }

                if (pontosaldo > pontosbeto) {
                    System.out.println("Teste " + testes);
                    System.out.println("Aldo");
                    System.out.println();

                } else {
                    if (pontosbeto > pontosaldo) {
                        System.out.println("Teste " + testes);
                        System.out.println("Beto");
                        System.out.println();
                    }
                }
            }

        }
    }

    public static void main(String[] args) {
        int jogadadobeto = 0;
        int jogadadoaldo = 0;
        int rodadas = 1;
        int pontosaldo = 0;
        int pontosbeto = 0;
        int testes = 0;

        Imprimirovencedordobafo(jogadadoaldo, jogadadobeto, rodadas, pontosaldo, pontosbeto, testes);
    }
}
