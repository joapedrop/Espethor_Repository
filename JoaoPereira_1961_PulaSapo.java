public class JoaoPereira_1961_PulaSapo {
    static java.util.Scanner ler = new java.util.Scanner(System.in);

    public static int LerNumInt() {
        int numero = 0;

        numero = ler.nextInt();

        return numero;
    }

    public static int[] CriarVetor(int tamanho) {
        int[] vetor = new int[tamanho];

        for (int i = 0; i < tamanho; i++) {
            vetor[i] = LerNumInt();
        }

        return vetor;
    }

    public static void ImprimirSeVenceuouNao(int[] v, int tamanho, int tamanhopulo) {
        int pulos = 0;
        for (int i = 0; i < tamanho; i++) {
            if ((tamanhopulo + v[i]) > v[i]) {
                pulos++;
            }
        }

        if (pulos == tamanho) {
            System.out.println("YOU WIN");
        } else {
            System.out.println("GAME OVER");
            
        }
    }

    public static void main(String[] args) {
        int tamanhopulo = 0;
        int tamanho = 0;

        tamanhopulo = LerNumInt();

        tamanho = LerNumInt();

        int[] vetor = CriarVetor(tamanho);

        ImprimirSeVenceuouNao(vetor, tamanho, tamanhopulo);

    }
}
