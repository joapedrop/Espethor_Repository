public class Xadrez {
    static java.util.Scanner ler = new java.util.Scanner(System.in);

    public static int LerNumInt() {
        int numero = 0;

        numero = ler.nextInt();

        return numero;
    }

    public static void main(String[] args) {
        int altura = 0;

        altura = LerNumInt();

        for (int i= 0; i < altura; i++) {
            for (int j = 0; j < altura; j++) {
                if ((i + j)%2 == 0) {
                    System.out.print("B");
                } else {
                    System.out.print("P");
                }
                }
                System.out.println();
            }
        }
    }

