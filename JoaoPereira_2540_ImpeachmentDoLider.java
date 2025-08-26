public class JoaoPereira_2540_ImpeachmentDoLider {
    static java.util.Scanner ler = new java.util.Scanner(System.in);

    public static int LerNumIntVoto() {
        int numero = 0;

        numero = ler.nextInt();

        return numero;
    }

    public static int LerNumIntqtddepessoadotime() {
        int numero = 0;

        numero = ler.nextInt();

        return numero;
    }

    public static double CalcularMediasPessoas(int qtddepessoasdotime, int impeachment,int numero2, int numero3) {
        double media = 0.0f;

        media = qtddepessoasdotime * (numero2 / numero3);

        return media;
    }

    public static boolean Decisao(int impeachment, int qtddepessoasdotime) {
        boolean decisao = false;
        double media = 0;
        int numero2 = 2;
        int numero3 = 3;

      media = CalcularMediasPessoas(qtddepessoasdotime,impeachment, numero2, numero3); 

        if (impeachment > media) {
            decisao = true;
        }

        return decisao;
    }

    public static void ImprimirDecisaodoGrupo(int voto, int qtddepessoasdotime,
            int impeachment) {

        while (ler.hasNext()) {
            qtddepessoasdotime = LerNumIntqtddepessoadotime();

            impeachment = 0;

            for (int i = 0; i < qtddepessoasdotime; i++) {
                voto = LerNumIntVoto();

                if (voto == 1) {
                    impeachment++;
                }
            }

            if (Decisao(impeachment, qtddepessoasdotime)) {
                System.out.println("impeachment");
            } else {
                System.out.println("acusacao arquivada");
            }

        }
    }

    public static void main(String[] args) {
        int voto = 0;
        int qtddepessoasdotime = 0;
        int impeachment = 0;

        ImprimirDecisaodoGrupo(voto, qtddepessoasdotime, impeachment);
    }
}
