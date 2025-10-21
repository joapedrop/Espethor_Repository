import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class BatalhaNaval {
    static java.util.Scanner ler = new java.util.Scanner(System.in);

    public static int LerNumInt() {
        int numero = 0;

        numero = ler.nextInt();
        ler.nextLine();

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

    public static void PosicionarNavios(int[][] navios, Set<String> lugaresproibidos, int qtddenavios) {
        Random aleatorio = new Random();
        boolean ehposiçao;
        String coordenada = null;

        for (int i = 0; i < qtddenavios; i++) {
            if (navios[i][2] == 1) {
                lugaresproibidos.add(navios[i][0] + "," + navios[i][1]);

            }
        }

        for (int navio = 0; navio < qtddenavios; navio++) {

            if (navios[navio][2] == 1) {
                continue;
            }

            do {
                navios[navio][0] = aleatorio.nextInt(5);
                navios[navio][1] = aleatorio.nextInt(5);
                ehposiçao = true;
                coordenada = (navios[navio][0] + "," + navios[navio][1]);

                if (lugaresproibidos.contains(coordenada)) {
                    ehposiçao = false;
                }

                if (ehposiçao) {
                    for (int anterior = 0; anterior < navio; anterior++) {
                        if (navios[navio][0] == navios[anterior][0] && navios[navio][1] == navios[anterior][1]) {
                            ehposiçao = false;
                            break;
                        }
                    }

                }

            } while (!ehposiçao);

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
        setColor(1);
        System.out.println("bem vindo ao jogo batalha naval");
        System.out.println("as regras são simples:");
        System.out.println("você tera que achar todos os navios do inimigo antes que ele ache os seus");
        System.out.println("será feito em um tabuleior de 5X5");
        System.out.println("e você e seu inimgo terão 3 navios cada");
        System.out.println();
    }

    public static void AtirarTorpedo(int[] torpedo, Set<String> torpedosatirados) {
        String coordenada = null;
        boolean jaatirou = false;
        while (!jaatirou) {

            System.out.print("Linha: ");
            torpedo[0] = LerNumInt();
            torpedo[0]--;

            System.out.print("Coluna: ");
            torpedo[1] = LerNumInt();
            torpedo[1]--;

            coordenada = (torpedo[0] + "," + torpedo[1]);

            if (torpedosatirados.contains(coordenada)) {
                System.out.printf("você já atirou o torpedo na coordenada (%d,%d), tente outra\n", torpedo[0] + 1,
                        torpedo[1] + 1);
            } else {
                torpedosatirados.add(coordenada);
                jaatirou = true;
            }

        }
    }

    public static int VerificaçãoAtirarTorpedoEspecial(int[][] navios, int[] torpedo, int[][] tabuleiro) {
        int acertos = 0;
        int centrolinha = torpedo[0];
        int centocoluna = torpedo[1];

        int[][] direçoes = { { 0, 0 }, { -1, 0 }, { 1, 0 }, { 0, -1 }, { 0, 1 } };

        for (int i = 0; i < direçoes.length; i++) {
            int linhaalvo = centrolinha + direçoes[i][0];
            int colunaalvo = centocoluna + direçoes[i][1];

            if (linhaalvo >= 0 && linhaalvo < 5 && colunaalvo >= 0 && colunaalvo < 5) {
                boolean acertoualvo = false;

                for (int navio = 0; navio < navios.length; navio++) {
                    if (navios[navio][2] == 2 && linhaalvo == navios[navio][0] && colunaalvo == navios[navio][1]) {
                        System.out.printf("Você acertou o torpedo especial em (%d,%d)\n", linhaalvo + 1,
                                colunaalvo + 1);
                        navios[navio][2] = 1;
                        tabuleiro[linhaalvo][colunaalvo] = 1;
                        acertos++;
                        acertoualvo = true;
                        break;
                    }
                }

                if (!acertoualvo) {
                    if (tabuleiro[linhaalvo][colunaalvo] != 1) {
                        tabuleiro[linhaalvo][colunaalvo] = 0;
                    }

                }
            }
        }

        return acertos;
    }

    public static boolean Acertou(int[][] navios, int[] torpedo) {
        for (int navio = 0; navio < navios.length; navio++) {
            if (torpedo[0] == navios[navio][0] && torpedo[1] == navios[navio][1]) {
                System.out.printf("Você acertou o torpedo (%d,%d)\n", torpedo[0] + 1, torpedo[1] + 1);
                navios[navio][2] = 1;
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

    public static void limparTela() {
        for (int i = 0; i < 40; ++i) {
            System.out.println();
        }
        System.out.print("\033\143");

    }

    public static void Dica(int[][] navios, int[] torpedo, int tentativas) {
        int linha = 0;
        int coluna = 0;

        for (int fila = 0; fila < navios.length; fila++) {
            if (navios[fila][2] == 0) {

                if (navios[fila][0] == torpedo[0]) {
                    linha++;
                }
                if (navios[fila][1] == torpedo[1]) {
                    coluna++;
                }
            }
        }
        System.out.printf("\n Dica %d: \nLinha %d -> %d Navios\n" + "Coluna %d -> %d Navios\n", tentativas,
                torpedo[0] + 1, linha, torpedo[1] + 1, coluna);
    }

    public static void setColor(int cor) {
        String s = "[0m";
        switch (cor) {
            case 0:
                s = "[30m";// preto
                break;
            case 1:
                s = "[31m";// vermelho
                break;
            case 2:
                s = "[32m";// verde
                break;
            case 3:
                s = "[33m";// amarelo
                break;
            case 4:
                s = "[34m";// azul
                break;
            case 5:
                s = "[35m";// magenta
                break;
            case 6:
                s = "[36m";// ciano
                break;
            case 7:
                s = "[97m";// branco
                break;
        }

        System.out.print((char) 27 + s);
    }

    public static boolean Ehtorpedonormal(int tentativas, int numeroaleatorio) {
        if (tentativas == numeroaleatorio) {
            return true;
        }

        return false;
    }

    public static void main(String[] args) {
        Random aleatorio = new Random();
        int qtddenavios = 3;
        int[][] tabuleiroJ1 = new int[5][5];
        int[][] tabuleiroJ2 = new int[5][5];
        int[][] naviosJ1 = new int[qtddenavios][3];
        int[][] naviosJ2 = new int[qtddenavios][3];
        int[] torpedoJ1 = new int[2];
        int[] torpedoJ2 = new int[2];
        int tentativasJ1 = 0;
        int tentativasJ2 = 0;
        int acertosJ1 = 0;
        int acertosJ2 = 0;
        String nomeJ1 = null;
        String nomeJ2 = null;
        Set<String> torpedosatiradosJ1 = new HashSet<>();
        Set<String> torpedosatiradosJ2 = new HashSet<>();
        int acertosrodadaJ1 = 0;
        int acertosrodadaJ2 = 0;
        int numeroaleatorioJ1 = aleatorio.nextInt(24) + 1;
        int numeroaleatorioJ2 = aleatorio.nextInt(24) + 1;

        regras();
        setColor(-1);
        System.out.println("digite o nome do jogador 1");
        nomeJ1 = LerNome();
        System.out.println();
        System.out.println("digite o nome do jogador 2");
        nomeJ2 = LerNome();

        limparTela();

        Criartabuleiro(tabuleiroJ1);
        Criartabuleiro(tabuleiroJ2);
        PosicionarNavios(naviosJ1, torpedosatiradosJ1, qtddenavios);
        PosicionarNavios(naviosJ2, torpedosatiradosJ2, qtddenavios);

        while (true) {
            // TURNO DO JOGADOR 1
            System.out.println();
            System.out.printf("turno do %s\n", nomeJ1);
            imagemdotabuleiro(tabuleiroJ2, nomeJ1);
            boolean torpedonormal = false;
            // VERIFICA SE O TORPEDO É NORMAL OU ESPECIAL(A CADA JOGO VAI TER UM UNICO
            // TORPEDO ESPECIAL)
            if (Ehtorpedonormal(tentativasJ1, numeroaleatorioJ1)) {
                torpedonormal = true;
            }

            AtirarTorpedo(torpedoJ1, torpedosatiradosJ1);
            limparTela();

            if (torpedonormal) {
                // VERIFICA SE ACERTOU O NAVIO DO JOGADOR 2
                boolean acertouJ1 = Acertou(naviosJ2, torpedoJ1);
                // ALTERA O TABULEIRO DO JOGADOR 2 DE ACORDO COM O RESULTADO
                AlterarTabuleiro(acertouJ1, tabuleiroJ2, torpedoJ1);

                if (acertouJ1) {
                    acertosrodadaJ1++;
                }
            } else {
                System.out.println("parabens! %s você ganhou um torpedo especial nesta rodada!");
                // ATIRA E VERIFICA OS ACERTOS DO TORPEDO ESPECIAL E MUDA O TABULEIRO DO JOGADOR
                // 2
                acertosrodadaJ1 = VerificaçãoAtirarTorpedoEspecial(naviosJ2, torpedoJ1, tabuleiroJ2);
            }
            ++tentativasJ1;
            acertosJ1 += acertosrodadaJ1;

            if (tentativasJ1 % 3 == 0) {
                // REPOSICIONA OS NAVIOS DO JOGADOR 2
                System.out.printf("os navios do %s se mexeram...\n", nomeJ2);
                PosicionarNavios(naviosJ2, torpedosatiradosJ1, qtddenavios);
            }

            if (acertosrodadaJ1 > 0) {
                System.out.printf("o %s acertou %d navio(s) nesta rodada\n", nomeJ1, acertosrodadaJ1);
                if (acertosJ1 > 3) {
                    // DÁ UMA DICA AO JOGADOR 1
                    Dica(naviosJ2, torpedoJ1, tentativasJ2);
                }
            } else {
                Dica(naviosJ2, torpedoJ1, tentativasJ2);
            }

            if (acertosJ1 == 3) {
                break;
            }

            // TURNO DO JOGADOR 2
            System.out.println();
            System.out.printf(" turno do %s\n", nomeJ2);
            imagemdotabuleiro(tabuleiroJ1, nomeJ2);
            torpedonormal = false;
            // VERIFICA SE O TORPEDO É NORMAL OU ESPECIAL(A CADA JOGO VAI TER UM UNICO
            // TORPEDO ESPECIAL)
            if (Ehtorpedonormal(tentativasJ2, numeroaleatorioJ2)) {
                torpedonormal = true;
            }

            AtirarTorpedo(torpedoJ2, torpedosatiradosJ2);
            limparTela();

            if (torpedonormal) {
                // VERIFICA SE ACERTOU O NAVIO DO JOGADOR 2
                boolean acertouJ2 = Acertou(naviosJ1, torpedoJ2);
                AlterarTabuleiro(acertouJ2, tabuleiroJ1, torpedoJ2);

                if (acertouJ2) {
                    acertosrodadaJ2++;
                }
            } else {
                System.out.println("parabens! %s você ganhou um torpedo especial nesta rodada!");
                // ATIRA E VERIFICA OS ACERTOS DO TORPEDO ESPECIAL E MUDA O TABULEIRO DO JOGADOR
                // 1
                acertosrodadaJ2 = VerificaçãoAtirarTorpedoEspecial(naviosJ1, torpedoJ2, tabuleiroJ1);
            }
            ++tentativasJ2;
            acertosJ2 += acertosrodadaJ2;

            if (tentativasJ2 % 3 == 0) {
                System.out.printf("os navios do %s se mexeram...\n", nomeJ1);
                // REPOSICIONA OS NAVIOS DO JOGADOR 1
                PosicionarNavios(naviosJ1, torpedosatiradosJ2, qtddenavios);
            }

            if (acertosrodadaJ2 > 0) {
                System.out.printf("o %s acertou %d navio(s) nesta rodada\n", nomeJ2, acertosrodadaJ2);
                if (acertosJ2 > 3) {
                    // DÁ UMA DICA AO JOGADOR 2
                    Dica(naviosJ1, torpedoJ2, tentativasJ2);
                }
            } else {
                Dica(naviosJ1, torpedoJ2, tentativasJ2);
            }

            if (acertosJ2 == 3) {
                break;
            }
        }

        System.out.println("Vencedor: ");
        // DECLARA O VENCEDOR
        if (acertosJ1 == 3) {
            System.out.printf("%s venceu", nomeJ1);
        } else {
            System.out.printf("%s venceu", nomeJ2);

        }

        System.out.println("Fim do jogo");
    }

}