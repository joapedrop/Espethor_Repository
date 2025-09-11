public class JoaoPereira_1179_PreenchimentoDeVetorIV {
    static java.util.Scanner ler = new java.util.Scanner(System.in);

    public static int LerNumInt() {
        int numero = 0;

        numero = ler.nextInt();

        return numero;
    }

    public static void ImprimirVetor(int[] v, String tipo) {
        for (int i = 0; i < v.length; i++) {
            System.out.printf("%d[%d] =  %d ", tipo, i, v[i]);
        }
    }

    public static void main(String[] args) {
        int indicepar = 0;
        int indiceimpar = 0;

        int[] vetor = new int[15];

        int[] Pares = new int[5];

        int[] Impares = new int[5];

        for (int i = 0; i < vetor.length; i++) {
            int numero = LerNumInt();

            if (numero % 2 == 0) {
                Pares[indicepar] = numero;
                indicepar++;

                if (indicepar == 5) {
                    ImprimirVetor(Pares, "par");
                    indicepar = 0;
                }
            }
            if (numero % 2 != 0) {
                Impares[indiceimpar] = numero;
                indiceimpar++;
                if (indiceimpar == 5) {
                    ImprimirVetor(Impares, "impar");
                    indiceimpar = 0;
                }
            }

        }
    }
}
