public class JoaoPereira_1547_Adivinha {
    static java.util.Scanner ler = new java.util.Scanner(System.in);

    public static int LerNumInt() {
        int numero = 0;

        numero = ler.nextInt();

        return numero;
    }

    public static void ImprimirQuemAdivinhouCerto(int alunos, int numerotentado, int numerocerto,
            int numerodequemadvinhoucerto, int testes) {
        testes = LerNumInt();

        for (int i = 0; i < testes; i++) {
            numerodequemadvinhoucerto = 0;
            alunos = LerNumInt();
            numerocerto = LerNumInt();

            for (int j = 0; j < alunos; j++) {
                numerotentado = LerNumInt();

                if (numerotentado == numerocerto || numerotentado == (numerocerto - 1)
                        || numerotentado == (numerocerto + 1)) {
                    if (numerodequemadvinhoucerto == 0) {
                        numerodequemadvinhoucerto = (j + 1);
                    }

                }

            }
            System.out.println(numerodequemadvinhoucerto);
        }
    }

    public static void main(String[] args) {
        int alunos = 0;
        int numerotentado = 0;
        int numerocerto = 0;
        int numerodequemadvinhoucerto = 0;
        int testes = 0;

        ImprimirQuemAdivinhouCerto(alunos, numerotentado, numerocerto, numerodequemadvinhoucerto, testes);
    }
}
