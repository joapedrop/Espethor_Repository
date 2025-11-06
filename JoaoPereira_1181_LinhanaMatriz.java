public class JoaoPereira_1181_LinhanaMatriz {
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

    public static double imprimirSomaLinha(double[][] M, int linha) {
        double soma = 0;

        for (int i = 0; i < M[linha].length; i++) {
            soma += M[linha][i];
        }
        return soma;
    }

    public static void main(String[] args) {
        char tipo = 'j';
        int linha = 0;
        double soma = 0;

        linha = LerNumInt();

        tipo = ler.next().charAt(0);

        double[][] matriz = CriarMatriz(12, 12);

        switch (tipo) {
            case 'S':
                soma = imprimirSomaLinha(matriz, linha);

                break;

            case 'M':
                soma = imprimirSomaLinha(matriz, linha) / matriz[linha].length;
                break;

            default:
                break;
        }
        System.out.printf("%.1f\n", soma);
    }
}
