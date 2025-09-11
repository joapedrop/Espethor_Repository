public class JoaoPereira_1553_PerguntasMaisFrequentes {
    static java.util.Scanner ler = new java.util.Scanner(System.in);

    public static int LerNumInt() {
        int numero = 0;

        numero = ler.nextInt();

        return numero;
    }

    public static void ImprimirDestaque(int perguntas, int quantidadeparaodestaque) {
        int maiorfrequencia = 0;

        while (true) {
            perguntas = LerNumInt();
            quantidadeparaodestaque = LerNumInt();

            if (perguntas == 0 && quantidadeparaodestaque == 0) {
                break;
            }

            int[] frequencia = new int[101];
            int numero = 0;

            for (int i = 0; i < perguntas; i++) {
                numero = LerNumInt();

                frequencia[numero] = frequencia[numero] + 1;
            }

            maiorfrequencia = EncontrarFrequencia(frequencia, quantidadeparaodestaque);

            System.out.printf("%d", maiorfrequencia);
        }

    }

 public static int EncontrarFrequencia(int[] frequencia, int quantidadeparaodestaque) {
            int maiorfrequencia = 0;

            for (int i = 0; i < frequencia.length; i++) {
                if(frequencia[i] >= quantidadeparaodestaque) {
                    maiorfrequencia++;
                }
            }
            return maiorfrequencia;
        }

    public static void main(String[] args) {
        int perguntas = 0;
        int quantidadeparaodestaque = 0;

        ImprimirDestaque(perguntas, quantidadeparaodestaque);
    }
}
