public class JoaoPereira_1564_VaiTerCopa {
    static java.util.Scanner ler = new java.util.Scanner(System.in);

    public static int LerNumInt() {
        int numero = 0;

        numero = ler.nextInt();

        return numero;
    }

    public static void ImprimirVaiterCopa(int reclamaçoes) {
        
        while (ler.hasNext()) {
                    reclamaçoes = ler.nextInt();

                    if(reclamaçoes == 0) {
                        System.out.println("vai ter copa!");
                    } else {
                        System.out.println("vai ter duas!");
                    }
                    
                }
            }
        
            public static void main(String[] args) {
        int reclamaçoes = 0;

        ImprimirVaiterCopa(reclamaçoes);

    }
}
