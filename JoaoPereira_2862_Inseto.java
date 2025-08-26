

public class JoaoPereira_2862_Inseto {
    static java.util.Scanner ler = new java.util.Scanner(System.in);

    public static int LerNumInt() {
        int numero = 0;

        numero = ler.nextInt();

        return numero;
    }

    public static void Imprimirniveldepoder(int seres, int niveldepoder) {

        seres  = LerNumInt();

        for (int i = 0; i < seres; i++) {
            niveldepoder = LerNumInt();

            if (niveldepoder <= 8000) {
                System.out.println("Inseto!");
            } else {
                System.out.println("Mais de 8000!");
            }
        }
    }


    public static void main(String[] args) {
        int seres = 0;
        int niveldepoder = 0;

        Imprimirniveldepoder(seres, niveldepoder);
    }
}
