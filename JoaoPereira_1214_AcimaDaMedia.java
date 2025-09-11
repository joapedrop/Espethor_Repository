public class JoaoPereira_1214_AcimaDaMedia {
    static java.util.Scanner ler = new java.util.Scanner(System.in);

    public static int LerNumInt() {
        int numero = 0;

        numero = ler.nextInt();

        return numero;
    }

    public static int[] CriarNotas(int totalalunos) {
        int[] v = new int[totalalunos];

        for (int i = 0; i < v.length; i++) {
            v[i] = LerNumInt();
        }

        return v;
    }

    public static int AcimaDaMedianNotas(int[] notas) {
        int aprovados = 0;

        for (int i = 0; i < notas.length; i++) {
            if (notas[i] > 70) {
                aprovados++;
            }
        }

        return aprovados;
    }

    public static double CalcularMedia(int totalalunos, int aprovados) {
        double media = 0;

        media = aprovados / totalalunos;

        media = media * 100;

        return media;
    }

    public static void ImprimirPorcento(double media) {
        System.out.printf("%.3f/n %", media);
    }

    public static void main(String[] args) {
        int totalalunos = 0;
        int testes = 0;
        int aprovados = 0;
        double media = 0;

        testes = LerNumInt();

        for (int i = 0; i < testes; i++) {
            totalalunos = LerNumInt();

            int[] notas = CriarNotas(totalalunos);

            aprovados = AcimaDaMedianNotas(notas);

            media = CalcularMedia(totalalunos, aprovados);

            ImprimirPorcento(media);
        }

    }
}
