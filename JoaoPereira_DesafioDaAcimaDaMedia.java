public class JoaoPereira_DesafioDaAcimaDaMedia {
    static java.util.Scanner ler = new java.util.Scanner(System.in);

    public static int LerNumInt() {
        int numero = 0;

        numero = ler.nextInt();

        return numero;
    }

    public static String[] CriarNomes(int tamanho) {
        String[] vetor = new String[tamanho];

        for (int i = 0; i < tamanho; i++) {
            vetor[i] = ler.next();
        }
        return vetor;
    }

    public static double[] CriarVetor(int tamanho) {
        double[] vetor = new double[tamanho];

        for (int i = 0; i < tamanho; i++) {
            vetor[i] = ler.nextInt();
        }

        return vetor;
    }

    public static double CalcularMediaTurma(double[] nota1, double[] nota2, int qtddealunos) {
        double mediaturma = 0;
        double soma = 0;

        for (int i = 0; i < qtddealunos; i++) {
            soma += nota1[i];

            soma += nota2[i];
        }

        mediaturma = soma / (qtddealunos * 2);

        return mediaturma;
    }

    public static double[] CalcularMediaAlunos(double[] nota1, double[] nota2, int qtddealunos) {
        double[] mediaalunos = new double[qtddealunos];

        for (int i = 0; i < qtddealunos; i++) {
            mediaalunos[i] = (nota1[i] + nota2[i]) / 2;
        }

        return mediaalunos;
    }

    public static int[] VerificarAlunosReprovados(double[] mediaalunos, double mediaturma, int qtddealunos,
            double[] nota1, double[] nota2) {

        int[] qtdaalunosreprovados = new int[qtddealunos];
        int qtddereprovados = 0;
        for (int i = 0; i < qtddealunos; i++) {
            boolean reprovado = false;

            if (mediaalunos[i] < mediaturma) {
                reprovado = true;
            }

            if (nota1[i] < 4.0 || nota2[i] < 4.0) {
                reprovado = true;
            }

            if (reprovado) {
                qtdaalunosreprovados[qtddereprovados] = i;
                qtddereprovados++;
            }
        }

        int[] aalunosreprovados = new int[qtddereprovados];
        for (int i = 0; i < qtddereprovados; i++) {
            aalunosreprovados[i] = qtdaalunosreprovados[i];
        }

        return aalunosreprovados;
    }

    public static void ImprimirResposta(double mediaturma, int[] aalunosreprovados) {
        System.out.println("Média turma:" + mediaturma);
        for (int i = 0; i < aalunosreprovados.length; i++) {
            System.out.printf("%s\n", aalunosreprovados);
        }
    }

    public static void main(String[] args) {
        int qtddealunos = 0;

        qtddealunos = LerNumInt();

        String[] nomes = CriarNomes(qtddealunos);

        double[] nota1 = CriarVetor(qtddealunos);

        double[] nota2 = CriarVetor(qtddealunos);

        double mediaturma = CalcularMediaTurma(nota1, nota2, qtddealunos);

        double[] mediaalunos = CalcularMediaAlunos(nota1, nota2, qtddealunos);

        int[] aalunosreprovados = VerificarAlunosReprovados(mediaalunos, mediaturma, qtddealunos, nota1, nota2);

        ImprimirResposta(mediaturma, aalunosreprovados);
    }
}
