public class triangulo {
   
    public static void main(String[] args) {
        int altura = 188;
        int i = 0;
        int j = 0;

        for ( i = 0; i <= altura; i++) {
            for (j = 0; j <= i; j++) {
                System.out.printf("*");
            }
            System.out.println();
        }
    }
}
