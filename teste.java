public class teste {
    static java.util.Scanner ler = new java.util.Scanner(System.in);

    public static int LerNumInt() {
        int numero = 0;

        numero = ler.nextInt();

        return numero;
    }

    public static void main(String[] args) {
        int quantidade = 0;
        int soma = 0;
        int media = 0;
        quantidade = LerNumInt();
        int[] vetor = new int[quantidade];
        for (int i = 0; i < quantidade; i++) {
            vetor[i] = LerNumInt();
        }
        int tamanho = vetor.length;

        for (int i = 0; i < tamanho; i++) {
            soma += vetor[i];

         System.out.println(i + " | " + vetor[i] + " | " + soma );
        }

        media = soma / tamanho;

        System.out.println(media);
        

    }
}