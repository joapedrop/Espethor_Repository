
public class Quadrado {

    static java.util.Scanner ler = new java.util.Scanner(System.in);

    public static int LerNumInt() {
        int numero = 0;

        numero = ler.nextInt();

        return numero;
    }

    public static void ImprimirQuadrado(int lados) {
        double numero = 0;

        for (int j = 0; j < lados; j++) {

            for (int i = 0; i < lados; i++) {
                numero = Math.pow(2, (i + j));

                System.out.printf("%.0f ", numero);

            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int lados = 0;

        lados = LerNumInt();

        ImprimirQuadrado(lados);

    }
}
