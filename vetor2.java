public class vetor2 {
    static java.util.Scanner ler = new java.util.Scanner(System.in);

    public static int LerNumInt() {
        int numero = 0;

        numero = ler.nextInt();

        return numero;
    }

    public static int[] GerarNotasAlunos(int quantidadedealunos) {
        int [] notas = new int [quantidadedealunos];

        for (int i = 0; i < quantidadedealunos; i++) {
            notas [i] = LerNumInt();
            
        }

        return notas;
    }

    public static double CalcularMedia(int [] notas) {
        int soma = 0;
        int tamanho = notas.length;
        double media = 0;

        for (int i = 0; i < tamanho; i++) {
            soma += notas[i];
        }

        media = soma / tamanho;

        return  media;
    }

    public static void ImprimirAlunosAcimadamedia(int [] notas, double media) {
        int tamanho = notas.length;

        System.out.println("Notas acima da média:");

        for (int i = 0; i < tamanho; i++) {
            
            if (notas [i] > media) {
                System.out.println(notas [i]);
            }
        }
    }
    
    public static void main(String[] args) {
        int quantidadedealunos = 0;

        quantidadedealunos = LerNumInt();

     int[] notas = GerarNotasAlunos(quantidadedealunos);
     
     double media = CalcularMedia(notas);

     System.out.println("Média das notas dos alunos: " + media);

        ImprimirAlunosAcimadamedia(notas, media);
        
    }
}
