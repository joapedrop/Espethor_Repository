public class botoes {
    

    public static void main(String[] args) {
        limparTela();
    }

    public static void limparTela() {
        for (int i = 0; i < 40; ++i) {
            System.out.println();
        }
        System.out.print("\033\143");
    }
}
