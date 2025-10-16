import javax.sound.sampled.*;
import java.io.File;
import java.io.IOException;

public class TocarSom {

    public static void tocarSom_Sino(){
        tocarSom(".\\sons\\Alesis-Sanctuary-QCard-Loose-Bell-C5.wav");
    }

    public static void tocarSom_Ouch(){
        tocarSom(".\\sons\\Ouch-4.wav");
    }

    public static void tocarSom_Crash(){
        tocarSom(".\\sons\\Crash-Cymbal-1.wav");
    }

    public static void tocarSom_Gato(){
        tocarSom(".\\sons\\Cat-Meow.wav");
    }

    public static void tocarSom(String caminhoArquivoSom){
              
        try {
            // Abrindo o arquivo de som
            File soundFile = new File(caminhoArquivoSom);
            if (!soundFile.exists()) {
                System.out.println("Arquivo de som não encontrado: " + caminhoArquivoSom);
                return;
            }

            // Criando um AudioInputStream
            AudioInputStream audioStream = AudioSystem.getAudioInputStream(soundFile);

            // Obtendo as informações do formato de áudio
            AudioFormat format = audioStream.getFormat();
            DataLine.Info info = new DataLine.Info(Clip.class, format);

            // Criando o Clip e carregando o áudio
            Clip audioClip = (Clip) AudioSystem.getLine(info);
            audioClip.open(audioStream);

            // Tocando o áudio
            System.out.println("Tocando som...");
            audioClip.start();

            // Mantendo o programa ativo enquanto o som toca            
            Thread.sleep(audioClip.getMicrosecondLength() / 1000);

            // Liberando recursos
            audioClip.close();
            audioStream.close();
            System.out.println("Som finalizado.");
        } catch (UnsupportedAudioFileException e) {
            System.err.println("O formato de áudio não é suportado.");
            e.printStackTrace();
        } catch (LineUnavailableException e) {
            System.err.println("Linha de áudio não disponível.");
            e.printStackTrace();
        } catch (IOException e) {
            System.err.println("Erro ao ler o arquivo de áudio.");
            e.printStackTrace();
        } catch (InterruptedException e) {
            System.err.println("O programa foi interrompido.");
            e.printStackTrace();
        }
    }
    public static void main(String[] args) {
        // Peguei exemplos de : https://freewavesamples.com/
       
        tocarSom_Sino();
        tocarSom_Ouch();
        tocarSom_Gato();
        tocarSom_Crash();

        
        
    }
}