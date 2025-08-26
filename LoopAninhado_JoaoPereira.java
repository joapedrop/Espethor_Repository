
public class LoopAninhado_JoaoPereira {

    static java.util.Scanner ler = new java.util.Scanner(System.in);

    public static int LerNumInt() {
        int numero = 0;

        numero = ler.nextInt();

        return numero;
    }

    public static void ImprimirQuadrado(int lados) {
        int cont = 1;

        for (int j = 0; j < lados; j++) {

            for (int i = 0; i < lados; i++) {
                System.out.printf("%d ", cont);
                cont++;
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
