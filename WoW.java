import java.util.Random;

public class WoW {

    public static void gotoXY(int linha, int coluna) {
        char escCode = 0x1B;
        System.out.print(String.format("%c[%d;%df", escCode, linha, coluna));
    }

    public static void limparTela() {
        for (int i = 0; i < 40; ++i) {
            System.out.println();
        }
        System.out.print("\033\143");

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

    public static void asciiArt() {

        // vejam em https://www.asciiart.eu


        limparTela();
        System.out.println("  Bom dia!");
        System.out.println("                  {}");
        System.out.println("  ,   A           {}");
        System.out.println(" / \\, | ,        .--.");
        System.out.println("|  =|= >        /.--.\\");
        System.out.println(" \\ /` | `       |====|");
        System.out.println("  `   |         |`::`|");
        System.out.println("      |     .-;`\\..../`;_.-^-._");
        System.out.println("     /\\\\/  /  |...::..|`   :   `|");
        System.out.println("     |:'\\ |   /'''::''|   .:.   |");
        System.out.println("      \\ /\\;-,/\\   ::  |..ASCII..|");
        System.out.println("      |\\ <` >  >._::_.| ':ART:' |");
        System.out.println("      | ``_/  |^^/>/> |   ':'   |");
        System.out.println("      |       |       \\    :    /");
        System.out.println("      |       |        \\   :   /");
        System.out.println("      |       |___/\\___|`-.:.-`");
        System.out.println("      |        \\_ || _/    `");
        System.out.println("      |        <_ >< _>");
        System.out.println("      |        |  ||  |");
        System.out.println("      |        |  ||  |");
        System.out.println("      |       _\\.:||:./_");
        System.out.println("      |      /____/\\____\\");
        System.out.println("");
        System.out.println(".:*~*:._.:*~*:._.:*~*:._.:*~*:._.:*~*:._.:*~*:._.:*~*:._.:*~*:._.:*~*:\n");
    }

    public static void printIF() {

        System.out.println("          .:**##**+.    .:::----=:-::.  ..-:::--::::::.    ");
        System.out.println("        .+###########. +**************-.+*************+.   ");
        System.out.println("       -##############==**************-:**************+:   ");
        System.out.println("      .################-**************-:**************+:   ");
        System.out.println("      :################***************-:**************+:   ");
        System.out.println("      :################+**************-:**************+:   ");
        System.out.println("      .*###############-**************-:**************+:   ");
        System.out.println("       .*#############:+**************-:**************+:   ");
        System.out.println("         .*########*-   -++++++++++++=  .=+++++++++++-:    ");
        System.out.println("       .====+=+++=+===  -=============.                    ");
        System.out.println("       +**************.=**************-                    ");
        System.out.println("       +**************.=**************-                    ");
        System.out.println("       +**************.=**************-                    ");
        System.out.println("       +**************.=**************-                    ");
        System.out.println("       +**************.=**************-                    ");
        System.out.println("       +**************.=**************-                    ");
        System.out.println("       +**************.:+*************-                    ");
        System.out.println("        .===========:    ::-======-=::                     ");
        System.out.println("       :*************=..+************+. =*************-.   ");
        System.out.println("       +**************.+**************-:**************+:   ");
        System.out.println("       +**************.=**************-:**************+:   ");
        System.out.println("       +**************.=**************-:**************+:   ");
        System.out.println("       +**************.=**************-:**************+:   ");
        System.out.println("       +**************.=**************-:**************+:   ");
        System.out.println("       +**************.=**************-:**************+:   ");
        System.out.println("       -*************=.:+************+- +*************=.   ");
        System.out.println("        .::::::::::::    :::::::::::::                     ");
        System.out.println("       +**************.=+*************-                    ");
        System.out.println("       +**************.=**************-                    ");
        System.out.println("       +**************.=**************-                    ");
        System.out.println("       +**************.=**************-                    ");
        System.out.println("       +**************.=**************-                    ");
        System.out.println("       +**************.=**************-                    ");
        System.out.println("       =**************.***************-                    ");
        System.out.println("       .*++++++++++++= .=++++++++++++=.                    ");
    }

    public static void printBart() {

        // https://www.asciiart.eu/cartoons/simpsons

        System.out.println("                                  ");
        System.out.println("          , ,\\ ,'\\,'\\ ,'\\ ,\\ ,    ");
        System.out.println("    ,  ;\\/ \' `'     `   '  /|    ");
        System.out.println("    |\\/                      |    ");
        System.out.println("    :                        |    ");
        System.out.println("    :                        |    ");
        System.out.println("     |                       |    ");
        System.out.println("     |                       |    ");
        System.out.println("     :               -.     _|    ");
        System.out.println("      :                \\     `.   ");
        System.out.println("      |         ________:______\\  ");
        System.out.println("      :       ,'o       / o    ;  ");
        System.out.println("      :       \\       ,'-----./   ");
        System.out.println("       \\_      `--.--'        )   ");
        System.out.println("      ,` `.              ,---'|   ");
        System.out.println("      : `                     |   ");
        System.out.println("       `,-'                   |   ");
        System.out.println("       /      ,---.          ,'   ");
        System.out.println("    ,-'            `-,------'     ");
        System.out.println("   '   `.        ,--'             ");
        System.out.println("         `-.____/                 ");
        System.out.println("                \\                 ");
    }

    

    public static void main(String[] args) throws InterruptedException {
        int linha, coluna, cor;
        int TAM_LINHA = 30;
        int TAM_COLUMA = 160;
        int NUM_CORES = 8;

        // gerador de numeros aleatorios
        Random gerador = new Random();

        limparTela();

        // laço de repetição
        for (int i = 0; i < 10000; i++) {

            // linha, coluna e cor aleatória
            linha = gerador.nextInt(TAM_LINHA);
            coluna = gerador.nextInt(TAM_COLUMA);
            cor = gerador.nextInt(NUM_CORES);
            // vai para a posição desejada
            gotoXY(linha, coluna);
            // escolhe a cor
            setColor(cor);
            // System.out.print("oi");
            System.out.print((char) (gerador.nextInt(26) + 'A'));

        }

        asciiArt();

       
        Thread.sleep(1000); // espera 1000 milissegundos -> 1 segundo
        setColor(2);
        printIF();
        Thread.sleep(1000); // espera 1000 milissegundos -> 1 segundo
        setColor(3);
        printBart();
        
        setColor(-1); // escolhe cor branca
        
    }
}
