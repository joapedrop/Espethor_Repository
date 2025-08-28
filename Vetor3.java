public class Vetor3 {

    static java.util.Scanner ler = new java.util.Scanner(System.in);

    public static int LerNumInt() {
        int numero = 0;

        numero = ler.nextInt();

        return numero;
    }

    public static void main(String[] args) {
        int N = 6;

        int[] vetor1 = CriarVetor(N);
        System.out.println("Vetor 1");
        ImprimirVetor(vetor1);

        int[] vetor2 = CriarVetor(N);
        System.out.println("Vetor 2");
        ImprimirVetor(vetor2);

        int[] vetor3 = SomarVetores(vetor1, vetor2, N);
        System.out.println("Vetor 3");
        ImprimirVetor(vetor3);

        int numero = 5;
        System.out.println("maiores que 5:");
        ImprimirMaiores(vetor3, numero);
        ImprimirMaiores(vetor2, numero);
        ImprimirMaiores(vetor1, numero);

        int[] vetor4 = inverterVetor(vetor1);
        System.out.println("vetor invertido 1");
        ImprimirVetor(vetor4);

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

    public static void ImprimirMaiores(int[] v, int numero) {

        for (int i = 0; i < v.length; i++) {
            if (v[i] > numero) {
                System.out.printf(" %d ", v[i]);
            }
        }
    }

    public static int[] SomarVetores(int[] v1, int[] v2, int tamanho) {
        int[] v3 = new int[tamanho];

        for (int i = 0; i < v3.length; i++) {
            v3[i] = v2[i] + v1[i];
        }

        return v3;
    }

    public static void ImprimirVetor(int[] v) {

        for (int i = 0; i < v.length; i++) {
            System.out.printf(" %d ", v[i]);
        }
        System.out.println();

    }

    public static int[] CriarVetor(int tamanho) {
        int[] vetor = new int[tamanho];

        for (int i = 0; i < tamanho; i++) {
            vetor[i] = ler.nextInt();
        }

        return vetor;
    }
}
