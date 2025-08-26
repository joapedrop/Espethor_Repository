/**
 * -digitar qtddetestes
 * -em cada tetse ter um x e y verificado maior e menor
 * -calcular entre o maior e menor os impares
 * - e depois imprimir
 */

public class JoaoPereira_1099_SomadeImparesConsecutivosII {
    static java.util.Scanner ler = new java.util.Scanner(System.in);

    public static int LerNumInt() {
        int numero = 0;

        numero = ler.nextInt();

        return numero;
    }

    public static int VerificarMaior(int numero1, int numero2) {
        int Maior = 0;

        if (numero1 > numero2) {
            Maior = numero1;
        } else {
            Maior = numero2;
        }

        return Maior;
    }

    public static int VerificarMenor(int numero1, int numero2) {
        int Menor = 0;

        if (numero1 < numero2) {
            Menor = numero1;
        } else {
            Menor = numero2;
        }

        return Menor;
    }

    public static void ImprimirSomadeImpares(int qtddetestes) {
        int x = 0;
        int y = 0;
        int numero1 = 0;
        int numero2 = 0;
        int soma = 0;

        for (int i = 0; i < qtddetestes; i++) {

            numero1 = LerNumInt();
            numero2 = LerNumInt();

            y = VerificarMaior(numero1, numero2);

            x = VerificarMenor(numero1, numero2);
            soma = 0;


            for (int j = x; j < y; j++) {
                if (j % 2 != 0) {
                    soma = soma + j;
                    
                } 

            }
            System.out.println(soma);
        }
    }

    public static void main(String[] args) {
        int qtddetestes = 0;

        qtddetestes = LerNumInt();

        ImprimirSomadeImpares(qtddetestes);
    }
}
