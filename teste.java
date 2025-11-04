public class teste {
    static java.util.Scanner ler = new java.util.Scanner(System.in);

     public static String LerNome() {
        String numero = null;

        numero = ler.next();

        return numero;
    }

    public static String[] CriarVetor(int tamanho) {
        String [] vetor = new String[tamanho];

        for (int i = 0; i < tamanho; i++) {
            vetor[i] = LerNome();
        }

        return vetor;
    }

    public static void main(String[] args) {
        int tamanho = 6;
        g.setFont(new Font())
      System.out.println("♔ ♕ ♖ ♗ ♘ ♙");
    }
}
