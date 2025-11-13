public class JoaoPereira_1827_MatrizQuadradaIV {
    static java.util.Scanner ler = new java.util.Scanner(System.in);

    public static int LerNumInt() {
        int numero = 0;

        numero = ler.nextInt();

        return numero;
    }

    public static void imprimirQuadrado(int C, int T, int B, int BD) {
        int[][] M = new int[T][T];
        C = T / 2;
        B = T / 3;
        BD = T - 1 - B;

        for (int i = 0; i < M.length; i++) {
            for (int j = 0; j < M[i].length; j++) {

              if (i >= B && i <= BD && j >= B && j <= BD) {
                M[i][j] = 1;
              } else {
                M[i][j] = 0;
              }

              if (i == j) {
                M[i][j] = 2;
              }

              if (j == T - 1 - i) {
                M[i][j] = 3;
              }
            }
        }

        M[C][C] = 4;

        for (int i = 0; i < T; i++) {
            for (int j = 0; j < T; j++) {
                System.out.print(M[i][j]);
            }
            System.out.println();
        }

        System.out.println();
    }

    public static void main(String[] args) {
        int centro = 0;
        int tamanho = 0;
        int borda = 0;
        int bordadedentro = 0;

        tamanho = LerNumInt();

        imprimirQuadrado(centro, tamanho, borda, bordadedentro);
    }
}
