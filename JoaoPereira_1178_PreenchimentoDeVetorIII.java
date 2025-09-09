public class JoaoPereira_1178_PreenchimentoDeVetorIII {
    static java.util.Scanner ler = new java.util.Scanner(System.in);

    public static double LerNumdouble() {
        double numero = 0;

        numero = ler.nextDouble();

        return numero;
    }

    public static double[] CriarVetor(int tamanho) {
     double[] vetor = new double[tamanho];
 
        for (int i = 0; i < tamanho; i++) {
            if(i == 0) {
            vetor[i] = LerNumdouble();
            } else {
                vetor[i] = vetor[i - 1] / 2;
            }
        }

        return vetor;
    }

    public static void ImprimirVetor(double[] v) {

        for (int i = 0; i < v.length; i++) {
            System.out.printf("N[%d] = %.4f\n ",i,  v[i]);
        }
        System.out.println();

    }

    public static void main(String[] args) {
        int tamanho = 100;

        double[] Vetor = CriarVetor(tamanho);

        ImprimirVetor(Vetor);
    }

  
}
