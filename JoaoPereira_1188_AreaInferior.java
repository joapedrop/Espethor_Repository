public class JoaoPereira_1188_AreaInferior {
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

    public static double imprimirSomaAreaInferior(double[][] M, double soma) {

        for (int i = 0; i < 12; i++) {
            for (int j = 0; j < 12; j++) {
                if ((i >= 1 && i <= 5 && j < i) || (i >= 6 && i <= 10 && j < 11 - 1)) {

                    soma += M[i][j];
                }
            }
        }
        return soma;
    }

    public static double imprimirMediaAreaInferior(double[][] M, double media) {
        double soma = 0;
        int qtddeelementos = 0;

        for (int i = 0; i < 12; i++) {
            for (int j = 0; j < 12; j++) {
                if ((i >= 1 && i <= 5 && j < i) || (i >= 6 && i <= 10 && j < 11 - 1)) {

                    soma += M[i][j];
                    qtddeelementos++;
                }
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
                soma = imprimirSomaAreaInferior(matriz, soma);
                System.out.printf("%.1f\n", soma);

                break;

            case 'M':
                media = imprimirMediaAreaInferior(matriz, media);
                System.out.printf("%.1f\n", media);
                break;

            default:
                break;
        }

    }
}
