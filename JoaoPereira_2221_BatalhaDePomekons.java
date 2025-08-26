public class JoaoPereira_2221_BatalhaDePomekons {
    static java.util.Scanner ler = new java.util.Scanner(System.in);

    public static int LerNumInt() {
        int numero = 0;

        numero = ler.nextInt();

        return numero;
    }

    public static void ImprimirVencedorDaBatalhaPokemon(int AtaqueDabriel, int AtaqueGuarte, int bonus,
            int DefesaDabriel, int DefesaGuarte, int GolpeEspecialDabriel, int GolpeEspecialGuarte, int NivelGuarte,
            int NivelDabriel, int rodadas) {

        rodadas = LerNumInt();

        for (int i = 0; i < rodadas; i++) {
            bonus = LerNumInt();

            AtaqueDabriel = LerNumInt();
            DefesaDabriel = LerNumInt();
            NivelDabriel = LerNumInt();

            GolpeEspecialDabriel = CalcularGolpeEspecialDabriel(AtaqueDabriel, DefesaDabriel, bonus, NivelDabriel);

            AtaqueGuarte = LerNumInt();
            DefesaGuarte = LerNumInt();
            NivelGuarte = LerNumInt();

            GolpeEspecialGuarte = CalcularGolpeEspecialGuarte(AtaqueGuarte, DefesaGuarte, bonus, NivelGuarte);

            if (GolpeEspecialDabriel > GolpeEspecialGuarte) {
                System.out.println("Dabriel");
            } else {
                if (GolpeEspecialGuarte > GolpeEspecialDabriel) {
                    System.out.println("Guarte");
                } else {
                    if (GolpeEspecialDabriel == GolpeEspecialGuarte) {
                        System.out.println("Empate");
                    }
                }
            }
        }
    }

    public static int CalcularGolpeEspecialGuarte(int AtaqueGuarte, int DefesaGuarte, int bonus, int NivelGuarte) {
        int GolpeEspecial = 0;

        if (NivelGuarte % 2 == 0) {

            GolpeEspecial = ((AtaqueGuarte + DefesaGuarte) / 2) + bonus;
        } else {
            GolpeEspecial = ((AtaqueGuarte + DefesaGuarte) / 2);
        }
        return GolpeEspecial;
    }

    public static int CalcularGolpeEspecialDabriel(int ataqueDabriel, int defesaDabriel, int bonus, int NivelDabriel) {
        int GolpeEspecial = 0;

        if (NivelDabriel % 2 == 0) {

            GolpeEspecial = ((ataqueDabriel + defesaDabriel) / 2) + bonus;
        } else {
            GolpeEspecial = ((ataqueDabriel + defesaDabriel) / 2);
        }
        return GolpeEspecial;
    }

    public static void main(String[] args) {
        int AtaqueGuarte = 0;
        int AtaqueDabriel = 0;
        int bonus = 0;
        int DefesaGuarte = 0;
        int DefesaDabriel = 0;
        int GolpeEspecialDabriel = 0;
        int GolpeEspecialGuarte = 0;
        int NivelGuarte = 0;
        int NivelDabriel = 0;
        int rodadas = 0;

        ImprimirVencedorDaBatalhaPokemon(AtaqueDabriel, AtaqueGuarte, bonus, DefesaDabriel, DefesaGuarte,
                GolpeEspecialDabriel, GolpeEspecialGuarte, NivelGuarte, NivelDabriel, rodadas);
    }
}
