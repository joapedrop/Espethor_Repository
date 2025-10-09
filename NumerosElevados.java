public class NumerosElevados {
    static java.util.Scanner ler = new java.util.Scanner(System.in);

    public static int LerNumInt() {
        int numero = 0;

        numero = ler.nextInt();

        return numero;
    }

    public static void ImprimirNumElevado(long qtd) {
        long numero = 0;
        long resultado = 0;

        numero = LerNumInt();

        for (int i = 0; i <= qtd; i++) {
            resultado = (int) Math.pow(numero, i);

            System.out.printf("elevado a %d = %d\n", i, resultado);
        }
    }

    public static void main(String[] args) {
        long qtd = 0;

        qtd = LerNumInt();

        ImprimirNumElevado(qtd); 
    }
}
