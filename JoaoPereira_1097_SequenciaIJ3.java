
public class JoaoPereira_1097_SequenciaIJ3 {

    public static void main(String[] args) {
        int i;
        int j;
        for (i = 1; i <= 9; i = i + 2) {

            for (j = i + 6; j >= i + 4; j--) {
                System.out.printf("I=%d J=%d\n", i, j);
            }
        }
    }
}
