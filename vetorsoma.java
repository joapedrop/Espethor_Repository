public class vetorsoma {
    public static void main(String[] args) {
        int[] vetor = new int[5];
        int soma = 0;
        int media = 0;

        vetor[0] = 10;
        vetor[1] = 20;
        vetor[2] = 30;
        vetor[3] = 40;
        vetor[4] = 50;
        
        int tamanho = vetor.length;

     for (int i = 0; i < tamanho; i++) {
         soma += vetor[i];

         System.out.println(i + " | " + vetor[i] + " | " + soma );
     }

     media = soma / tamanho;

     System.out.println(media);
        
    }
}
