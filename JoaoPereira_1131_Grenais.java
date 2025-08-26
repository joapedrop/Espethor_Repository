public class JoaoPereira_1131_Grenais {
    static java.util.Scanner ler = new java.util.Scanner(System.in);

    public static int LerNumInt() {
        int numero = 0;

        numero = ler.nextInt();

        return numero;
    }

    public static void ImprimirGrenais(int grenais, int simounao, int gremio, int inter, int empates,
            int vitoriasgremio, int vitoriasinter) {

        do {
            inter = LerNumInt();

            gremio = LerNumInt();

            if (inter > gremio) {
                vitoriasinter++;
            } else {
                if (gremio > inter) {
                    vitoriasgremio++;
                } else {
                    if (inter == gremio) {
                        empates++;
                    }
                }
            }

            System.out.println("Novo grenal (1-sim 2-nao)");
            simounao = LerNumInt();
            if (simounao != 2) {
                grenais++;
            }

        } while (simounao != 2);

        System.out.println(grenais + " grenais");
        System.out.println("Inter: " + vitoriasinter);
        System.out.println("Gremio: " + vitoriasgremio);
        System.out.println("Empates: " + empates);
        if (vitoriasinter > vitoriasgremio) {
            System.out.println("Inter venceu mais");
        } else {
            if (vitoriasgremio > vitoriasinter) {
                System.out.println("Gremio venceu mais");
            } else {
                if (vitoriasgremio == vitoriasinter) {
                    System.out.println("Nao houve vencedor");
                }
            }
        }
    }

    public static void main(String[] args) {
        int grenais = 1;
        int simounao = 0;
        int gremio = 0;
        int inter = 0;
        int empates = 0;
        int vitoriasgremio = 0;
        int vitoriasinter = 0;

        ImprimirGrenais(grenais, simounao, gremio, inter, empates, vitoriasgremio, vitoriasinter);
    }
}
