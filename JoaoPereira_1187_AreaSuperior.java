
public class JoaoPereira_1187_AreaSuperior {
    static java.util.Scanner ler = new java.util.Scanner(System.in);

    public static double LerNumDouble() {
        double numero = 0;

        numero = ler.nextDouble();

        return numero;
    }

    public static int LerNumInt() {
        int numero = 0;

        numero = ler.nextInt();

        return numero;
    }

    public static double[][] CriarMatriz(int T, int L) {
        double[][] Ma = new double[T][L];

        for (int i = 0; i < Ma.length; i++) {
            for (int j = 0; j < Ma[i].length; j++) {
                Ma[i][j] = LerNumDouble();
            }
        }

        return Ma;
    }

    public static double imprimirSomaAreaSuperior(double[][] M, double soma) {

        for (int i = 0; i < 11; i++) {
            for (int j = 1 + i; j < 11 - i; j++) {

                soma += M[i][j];

            }
        }
        return soma;
    }

    public static double imprimirMediaAreaSuperior(double[][] M, double media) {
        double soma = 0;
        int qtddeelementos = 0;

        for (int i = 0; i < 11; i++) {
            for (int j = i + 1; j < 11 - i; j++) {

                soma += M[i][j];
                qtddeelementos++;

            }
        }

        media = soma / qtddeelementos;

        return media;
    }

    public static void main(String[] args) {
        char tipo = 'j';
        double soma = 0;
        double media = 0;

        tipo = ler.next().charAt(0);

        double[][] matriz = CriarMatriz(12, 12);

        switch (tipo) {
            case 'S':
                soma = imprimirSomaAreaSuperior(matriz, soma);
                System.out.printf("%.1f\n", soma);

                break;

            case 'M':
                media = imprimirMediaAreaSuperior(matriz, media);
                System.out.printf("%.1f\n", media);
                break;

            default:
                break;
        }

    }
}
