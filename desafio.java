public class desafio {
    

    public static void main(String[] args) {
        int []vetor1 = new int[5];
        vetor1[0] = 5;
        vetor1[1] = 5;
        vetor1[2] = 6;
        vetor1[3] = 0;
        vetor1[4] = 0;

        int []vetor2 = new int[5];
        vetor2[0] = 0;
        vetor2[1] = 0;
        vetor2[2] = 4;
        vetor2[3] = 0;
        vetor2[4] = 0;

        int []vetor3 = new int[5];
        vetor3[0] = 0;
        vetor3[1] = 0;
        vetor3[2] = 0;
        vetor3[3] = 0;
        vetor3[4] = 0;


       int tamanho = vetor3.length;

        for (int i = 0; i < tamanho; i++) {
            vetor3[i] = vetor1[i] + vetor2[i];
            if(vetor3[i] > 10) {
                vetor3[i - 1] = vetor2[i + 1];
            }
            System.out.print(vetor3[i]);
        }
    }
}
