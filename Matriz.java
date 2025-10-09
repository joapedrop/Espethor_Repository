public class Matriz {
    static java.util.Scanner ler = new java.util.Scanner(System.in);

    public static int LerNumInt() {
        int numero = 0;

        numero = ler.nextInt();

        return numero;
    }

    /**
     * matriz tem colunas e linhas e os espaços são chamados de celulas
     * 0 1 2 3 4 5 6
     * 1|-----------|
     * 2| |
     * 3| |
     * 4| |
     * 5| |
     * 6|-----------|
     */

    public static int[][] CriarMatriz(int T, int L) {

        int[][] M = new int[T][L];

        for (int i = 0; i < T; i++) {
            for (int j = 0; j < L; j++) {
                M[i][j] = LerNumInt();
            }
        }
        return M;
    }

    public static void ImprimirMatriz(int[][] matriz) {
        System.out.println("Matriz");
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + "\t");
            }
            System.out.println();
        }
    }

    public static int SomarElementos(int[][] M) {
        int soma = 0;

        for (int i = 0; i < M.length; i++) {
            for (int j = 0; j < M[i].length; j++) {
                soma += M[i][j];
            }
        }
        return soma;
    }

    public static int SomarElementosLinha(int[][] M, int linha) {
        int soma = 0;

        for (int i = 0; i < M[linha].length; i++) {
            soma += M[linha][i];
        }

        return soma;
    }

    public static void ImprimirElementoPosicao(int[][] M) {
        int MaiorValor = 0;
        int linha = 0;
        int coluna = 0;

        for (int i = 0; i < M.length; i++) {
            for (int j = 0; j < M[i].length; j++) {

                if (M[i][j] > MaiorValor) {
                    MaiorValor = M[i][j];
                    linha = i;
                    coluna = j;
                }
            }
        }

        System.out.printf("Maior Valor = %d\n", MaiorValor);
        System.out.printf("Linha = %d Coluna = %d\n", linha, coluna);
    }

    public static void ImprimirSomaCadaLinha(int[][] matriz) {
        int soma = 0;

        for (int i = 0; i < matriz.length; i++) {
            soma = SomarElementosLinha(matriz, i);
            System.out.printf("soma linha(%d): %d\n", i, soma);

        }
    }

    public static void main(String[] args) {
        int tamanho = 3;
        int largura = 3;

        int[][] matriz = CriarMatriz(tamanho, largura);

        ImprimirMatriz(matriz);

        int soma = SomarElementos(matriz);

        System.out.println("soma: " + soma);

        int linha = LerNumInt();

        int somalinha = SomarElementosLinha(matriz, linha);

        System.out.printf("soma linha(%d): %d\n", linha, somalinha);

        ImprimirElementoPosicao(matriz);

        ImprimirSomaCadaLinha(matriz);
    }
}
