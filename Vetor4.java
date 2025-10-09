public class Vetor4 {
    /**
     * cria um vetor de inteiros com numeros aleatorios
     * @param tamanho
     * @param maxvalor
     * @return vetor de inteiros com numeros aleatorios entre 0 e maxValor-1
     * (anotações: math.random vai de 0  até menor do que 1
     * se voce alterar um vetor dentro de um metodo ira alterar no endereço dele mesmo sendo void)
     * git config --global user.name ""
     * git config --global user.email ""
     */
    
    public static void main(String[] args) {
        int [] v1 = CriarVetorAleatorio(20, 10);
        int [] v2 = CriarVetorAleatorio(20, 20);

        System.out.println("Vetor 1: ");
        ImprimirVetor(v1);
        System.out.println("Vetor 2: ");
        ImprimirVetor(v2);

        int [] v3 = ConcatenarVetores(v1, v2);
        System.out.println("Vetor 3: ");
        ImprimirVetor(v3);

        int a = 5;
        System.out.println("a do main: " + a);
        DobrarValor(a);
        System.out.println("a do main depois do metodo: " + a);

        int [] v4 = CriarVetorAleatorio(5, 10);
        System.out.println("Vee·
        AlterarVetorPorReferencia(v4);
        
        System.out.println("Vetor 4 alterado: ");
        ImprimirVetor(v4);
    }

    public static void AlterarVetorPorReferencia(int [] v) {
        for (int i = 0; i < v.length; i++) {
            v[i] *= 2;
        }
    }

    public static void DobrarValor(int b) {
        b = b * 2;

        System.out.println("b do metodo: " + b);
    }

    public static int [] CriarVetorAleatorio(int tamanho, int maxValor) {
        int [] vetor = new int [tamanho];
        for (int i = 0; i < tamanho; i++) {
            vetor[i] = (int) (Math.random() * maxValor);
        }
        return vetor;
    }

    public static void ImprimirVetor(int[] v) {

        for (int i = 0; i < v.length; i++) {
            System.out.printf(" %d ", v[i]);
        }
        System.out.println();

    }

    public static int[] ConcatenarVetores(int [] vetor1, int [] vetor2) {
        int tamanho1 = vetor1.length;
        int tamanho2 = vetor2.length;
        int [] vetor3 = new int [tamanho1 + tamanho2];
        for (int i = 0; i < tamanho1; i++) {
            vetor3[i] = vetor1[i];
        }

        for (int i = 0; i < tamanho2; i++) {
            vetor3[tamanho1 + i] = vetor2[i];
        }

        return vetor3;
    }
}
