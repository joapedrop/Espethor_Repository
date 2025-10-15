import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class RoletaRussa {

    static java.util.Scanner ler = new java.util.Scanner(System.in);

    public static int LerNumInt() {
        int numero = 0;

        numero = ler.nextInt();

        return numero;
    }

    public static void main(String[] args) {
        Random sorteio = new Random();
        int qtddebalas = 6;
        int balasquefaltam = 5;
        int numeroddabala = sorteio.nextInt(qtddebalas) + 1;
        Set<Integer> tamborjaescolhido = new HashSet<>();
        int escolha = 0;
        boolean morreu = false;

        while (true) {
            System.out.println("falta ainda " + balasquefaltam + " balas");
          
            escolha = LerNumInt();
        
            if (escolha == numeroddabala) {
                morreu = true;
                break;
            } else {
                if (tamborjaescolhido.contains(escolha)) {
                    System.out.println("você ja escolheu esse numero, tente outro");
                } else {
                    balasquefaltam--;
                    tamborjaescolhido.add(escolha);
                    if (balasquefaltam != 1) {
                        System.out.println("continue jogando");

                    }
                }

                if (balasquefaltam == 0) {
                    break;

                }
            }
        }

        if (morreu) {
            System.out.println("VOCÊ MORREU!!!!!!!!!!!!!!!!");
        } else {
            System.out.println("VOCÊ SOBREVIVEU!!!!!!!!!!!!");
        }

    }
}
