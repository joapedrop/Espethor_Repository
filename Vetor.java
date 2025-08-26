public class Vetor {
   /**vetor consegue fazer uma variavel guardar mais de uma variavel
    * ex: temos um armario e nos guardamos
    int A1 = 10 A2 = 32 A3 = 51 A4 = 41 A5 = 3 A6 = 4
    por que so tem numeros inteiros? pois ele é só um tipo e temos que colocar a sua tipagem
    
    essas variaveis tipo A1 se chama indice 
    
    e quando trabalhamos nao colocamos uma variavel mais um numero sim.
    ex: 0 1 2 3 4 5
    o ultimo indice sempre vai ser o ultimo indice menos 1.
    ex: o indice 5 e o seu elemento é 4
    quando queremos descobrir a media fazemos.
     (10 + 32 + 51 + 41 + 3 + 4)/6 
     
     para abrir cada porta utilizamos um for
     for(int i = 0; i < (vetor[i] - 1); i++){
        media += indice;}
        
        se eu colocar um vetor que nao existe vai dar arrayindexoutofboundsexception 
        
        **/
   
    public static void main(String[] args) {
        int[] vetor = new int[5];

        vetor[0] = 10;
        vetor[1] = 20;
        vetor[2] = 30;
        vetor[3] = 40;
        vetor[4] = 50;
        
        int tamanho = vetor.length;

     for (int i = 0; i < tamanho; i++) {
         System.out.println("Elemento " + i + ": " + vetor[i]);
     }

        
    }
}
