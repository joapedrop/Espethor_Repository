public class JoaoPereira_1145_SequenciaLogica2 {
    static java.util.Scanner ler = new java.util.Scanner(System.in);

    public static int LerNumInt() {
        int numero = 0;

        numero = ler.nextInt();

        return numero;
    }

    public static void main(String[] args) {
        int x = 0;
        int y = 0;

        x = LerNumInt();

        y = LerNumInt();

        for (int i = 1; i <= y; i++) {

            System.out.print("" + i);
            if ((i % x) == 0) {
                System.out.println();
            }

        }

    }
}
