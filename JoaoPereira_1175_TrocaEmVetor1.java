public class JoaoPereira_1175_TrocaEmVetor1 {
    static java.util.Scanner ler = new java.util.Scanner(System.in);

    public static int[] CriarVetor(int tamanho) {
        int[] vetor = new int[tamanho];

        for (int i = 0; i < tamanho; i++) {
            vetor[i] = ler.nextInt();
        }

        return vetor;
    }

    public static int[] inverterVetor(int[] v) {
        int[] vetor = new int[v.length];
        int tamanho = v.length;

        int[] Vinv = new int[tamanho];

        for (int i = 0; i < tamanho; i++) {
            Vinv[tamanho - (1 + i)] = v[i];
        }

        return Vinv;
    }

    public static void ImprimirVetor(int[] v) {

        for (int i = 0; i < v.length; i++) {
            System.out.print("N[" + i + "] = " + v[i]);
            System.out.println();
        }

    }

    public static void main(String[] args) {
        int tamanho = 20;

        int[] Vetor = CriarVetor(tamanho);

        int[] VetorInvertido = inverterVetor(Vetor);

        ImprimirVetor(VetorInvertido);
    }

}
