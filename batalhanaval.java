import java.util.Random;

public class batalhanaval {
    static java.util.Scanner ler = new java.util.Scanner(System.in);

    public static int LerNumInt() {
        int numero = 0;

        numero = ler.nextInt();

        return numero;
    }

    public static String LerNome() {
        String nome = null;

        nome = ler.nextLine();

        return nome;
    }

    public static void Criartabuleiro(int[][] tabuleiro) {
        for (int linha = 0; linha < 5; linha++) {
            for (int coluna = 0; coluna < 5; coluna++) {
                tabuleiro[linha][coluna] = -1;
            }
        }

    }

    public static void limparTela() {
        for (int i = 0; i < 40; ++i) {
            System.out.println();
        }
        System.out.print("\033\143");
    }

    public static void PosicionarNavios(int[][] navios) {
        Random aleatorio = new Random();

        for (int navio = 0; navio < 3; navio++) {
            navios[navio][0] = aleatorio.nextInt(5);
            navios[navio][1] = aleatorio.nextInt(5);

            for (int anterior = 0; anterior < navio; anterior++) {
                if (navios[navio][0] == navios[anterior][0] && navios[navio][1] == navios[anterior][1]) {
                    do {
                        navios[navio][0] = aleatorio.nextInt(5);
                        navios[navio][1] = aleatorio.nextInt(5);
                    } while (navios[navio][0] == navios[anterior][0] && navios[navio][1] == navios[anterior][1]);
                }
            }
        }
    }

    public static void imagemdotabuleiro(int[][] tabuleiro, String nome) {
        System.out.println("Legenda: ");
        System.out.println("Nenhum tiro foi dado naquele bloco = ~");
        System.out.println("O torpedo foi atirado e não havia nada = *");
        System.out.printf("o %s atirou o torpedo e tinha um navio lá = X\n", nome);
        System.out.println();
        System.out.println("\t1 \t2 \t3 \t4 \t5");
        System.out.println();

        for (int linha = 0; linha < 5; linha++) {
            System.out.print((linha + 1) + "");
            for (int coluna = 0; coluna < 5; coluna++) {
                if (tabuleiro[linha][coluna] == -1) {
                    System.out.print("\t" + "~");
                } else {
                    if (tabuleiro[linha][coluna] == 0) {
                        System.out.print("\t" + "*");
                    } else {
                        if (tabuleiro[linha][coluna] == 1) {
                            System.out.print("\t" + "X");
                        }
                    }
                }
            }
            System.out.println();
        }
        System.out.println();
    }

    public static void regras() {
        System.out.println("bem vindo ao jogo batalha naval");
        System.out.println("as regras são simples:");
        System.out.println("você tera que achar todos os navios do inimigo antes que ele ache os seus");
        System.out.println("será feito em um tabuleior de 5X5");
        System.out.println("e você e seu inimgo terão 3 navios cada");
        System.out.println();
    }

    public static void AtirarTorpedo(int[] torpedo) {
        System.out.print("Linha: ");
        torpedo[0] = LerNumInt();
        torpedo[0]--;

        System.out.print("Coluna: ");
        torpedo[1] = LerNumInt();
        torpedo[1]--;
    }

    public static boolean Acertou(int[][] navios, int[] torpedo) {
        for (int navio = 0; navio < navios.length; navio++) {
            if (torpedo[0] == navios[navio][0] && torpedo[1] == navios[navio][1]) {
                System.out.printf("Você acertou o torpedo (%d,%d)\n", torpedo[0] + 1, torpedo[1] + 1);
                return true;
            }
        }

        return false;
    }

    public static void AlterarTabuleiro(boolean acertousimounao, int[][] tabuleiro, int[] torpedo) {
        if (acertousimounao) {
            tabuleiro[torpedo[0]][torpedo[1]] = 1;
        } else {
            tabuleiro[torpedo[0]][torpedo[1]] = 0;
        }
    }

    public static void Dica(int[][] navios, int[] torpedo, int tentativas, String nome) {
        int linha = 0;
        int coluna = 0;

        for (int fila = 0; fila < navios.length; fila++) {
            if (navios[fila][0] == torpedo[0]) {
                linha++;
            }
            if (navios[fila][1] == torpedo[0]) {
                coluna++;
            }
        }
        System.out.printf("\n Dica %d do %s: \nLinha %d -> %d Navio(s)\n" + "Coluna %d -> %d Navio(s)\n", tentativas, nome,
                torpedo[0] + 1, linha, torpedo[1] + 1, coluna);
    }

    public static void main(String[] args) {
        int[][] tabuleiroJ1 = new int[5][5];
        int[][] tabuleiroJ2 = new int[5][5];
        int[][] naviosJ1 = new int[3][2];
        int[][] naviosJ2 = new int[3][2];
        int[] torpedoJ1 = new int[2];
        int[] torpedoJ2 = new int[2];
        int tentandoJ1 = 0;
        int tentandoJ2 = 0;
        int acertosJ1 = 0;
        int acertosJ2 = 0;
        String nomeJ1 = null;
        String nomeJ2 = null;

        regras();
        System.out.println("digite o nome do jogador 1");
        nomeJ1 = LerNome();
        System.out.println();
        System.out.println("digite o nome do jogador 2");
        nomeJ2 = LerNome();

        limparTela();

        Criartabuleiro(tabuleiroJ1);
        Criartabuleiro(tabuleiroJ2);
        PosicionarNavios(naviosJ1);
        PosicionarNavios(naviosJ2);

        do {
            System.out.println();
            System.out.printf("turno do %s\n", nomeJ1);

            imagemdotabuleiro(tabuleiroJ2, nomeJ1);
            AtirarTorpedo(torpedoJ1);
            tentandoJ1++;

            limparTela();

            boolean acertouJogador1 = Acertou(naviosJ2, torpedoJ1);

            if (acertouJogador1) {
                acertosJ1++;
                if (acertosJ1 != 3) {
                    Dica(naviosJ2, torpedoJ1, tentandoJ1, nomeJ1);
                }
            } else {
                Dica(naviosJ2, torpedoJ1, tentandoJ1, nomeJ1);
            }

            AlterarTabuleiro(acertouJogador1, tabuleiroJ2, torpedoJ1);

            System.out.println();
            System.out.printf(" turno do %s\n", nomeJ2);
            imagemdotabuleiro(tabuleiroJ1, nomeJ2);
            AtirarTorpedo(torpedoJ2);
            tentandoJ2++;

            limparTela();

            boolean acertouJogador2 = Acertou(naviosJ1, torpedoJ2);

            if (acertouJogador2) {
                acertosJ2++;
                if (acertosJ2 != 3) {
                    Dica(naviosJ1, torpedoJ2, tentandoJ2,nomeJ2);
                }
            } else {
                Dica(naviosJ1, torpedoJ2, tentandoJ2, nomeJ2);
            }

            AlterarTabuleiro(acertouJogador2, tabuleiroJ1, torpedoJ2);

        

        } while (acertosJ1 < 3 && acertosJ2 < 3);
        System.out.println();
        System.out.println("Vencedor: ");
        if (acertosJ1 == 3) {
            System.out.printf("%s venceu", nomeJ1);
        } else {
            System.out.printf("%s venceu", nomeJ2);

        }

        System.out.println("Fim do jogo");
    }

}