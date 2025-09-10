public class JoaoPereira_1180_MenorEPosiçao {
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

    public static void ImprimirMenorEPosicao(int v[], int tamanho) {
        int menorvalor = 100;
        int posicao = 0;
        for (int i = 0; i < tamanho; i++) {
            if(v[i] < menorvalor) {
                menorvalor = v[i];
                posicao = i;
            }
        }

        System.out.println("Menor valor: " + menorvalor);
        System.out.println("Posicao: " + posicao);
    
    }

    public static void main(String[] args) {
        int tamanho = 0;

        tamanho = LerNumInt();

        int[] vetor = CriarVetor(tamanho);

        ImprimirMenorEPosicao(vetor, tamanho);

    }

}
