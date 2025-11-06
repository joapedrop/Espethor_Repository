public class JoaoPereira_1182_ColunanaMatriz {
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

    public static double imprimirSomaColuna(double[][] M, int coluna) {
        double soma = 0;

        for (int i = 0; i < M[coluna].length; i++) {
            soma += M[i][coluna];
        }
        return soma;
    }

    public static void main(String[] args) {
        char tipo = 'j';
        int coluna = 0;
        double soma = 0;

        coluna = LerNumInt();

        tipo = ler.next().charAt(0);

        double[][] matriz = CriarMatriz(12, 12);

        switch (tipo) {
            case 'S':
                soma = imprimirSomaColuna(matriz, coluna);
                System.out.printf("%.1f\n", soma);

                break;

            case 'M':
              soma = imprimirMediaDiagonal
                break;

            default:
                break;
        }
        
    }
}


