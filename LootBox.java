import java.util.Random;

public class LootBox {

    static java.util.Scanner ler = new java.util.Scanner(System.in);

    public static int LerNumInt() {
        int numero = 0;

        numero = ler.nextInt();

        return numero;
    }

    public static void limparTela() {
        for (int i = 0; i < 40; ++i) {
            System.out.println();
        }
        System.out.print("\033\143");

    }

    public static void AbrirLootBox(int moedas, int custocaixa, String[] nomescomuns, String[] nomesraros, int chance) {
        while (true) {
            chance = new Random().nextInt(100);
            --moedas;
            if (chance >= 1 && chance <= 10) {
                System.out.println("VOCÊ PERDEU AS 10 MOEDAS!");
                System.out.println();
                moedas = moedas - 10;
                break;
            }

            if (chance > 10 && chance <= 90) {
                System.out
                        .println("VOCÊ GANHOU UM ITEM COMUM: " + nomescomuns[new Random().nextInt(nomescomuns.length)]);
                        System.out.println();
                moedas += 5;
                break;
            }

            if (chance > 90 && chance <= 100) {
                System.out.println("VOCÊ GANHOU UM ITEM RARO: " + nomesraros[new Random().nextInt(nomesraros.length)]);
                System.out.println();
                moedas += 20;
                break;
            }
        }
    }

    public static void main(String[] args) {
        int moedas = 100;
        int custocaixa = 1;
        String[] nomescomuns = new String[5];
        nomescomuns[0] = "Espada de Madeira";
        nomescomuns[1] = "Escudo de Madeira";
        nomescomuns[2] = "Arco de Madeira";
        nomescomuns[3] = "Capacete de Madeira";
        nomescomuns[4] = "Armadura de Madeira";
        String[] nomesraros = new String[5];
        nomesraros[0] = "espada cosmica";
        nomesraros[1] = "olho de agamoto";
        nomesraros[2] = "item bizarro :O";
        nomesraros[3] = "o filme do adam sandler";
        nomesraros[4] = "crack filosofal";
        Random aleatorio = new Random();
        int chance = aleatorio.nextInt(100);
        int escolha = 0;
        while (escolha != 2 && moedas > 0) {

            System.out.println("Escolha uma opção:\n1. Abrir Caixa de Loot (" + custocaixa + " moedas)\n2. Sair");

            escolha = LerNumInt();
            
            limparTela();
            
            switch (escolha) {
                case 1:
                    AbrirLootBox(moedas, custocaixa, nomescomuns, nomesraros, chance);

                    break;

                case 2:
                    System.out.println("Saindo do jogo. Você terminou com " + moedas + " moedas.");
                    break;

                default:
                    break;
            }
        }
    }
}
