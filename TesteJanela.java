import javax.swing.JOptionPane;

public class TesteJanela {
    public static void main(String[] args) {
        String inputString;
        int numero;

        inputString = JOptionPane.showInputDialog(
            null, // Componente pai (null para centralizar na tela)
            "Digite um número inteiro:", // Mensagem a ser exibida
            "Entrada de Número", // Título da janela
            JOptionPane.QUESTION_MESSAGE // Tipo de ícone
        );

        // Verifica se o usuário pressionou "Cancelar" ou fechou a janela
        if (inputString == null) {
            JOptionPane.showMessageDialog(null, "Operação cancelada.", "Aviso", JOptionPane.INFORMATION_MESSAGE);
            return; // Encerra o programa ou a função
        }

        try {
            // 2. Converte a String para int
            numero = Integer.parseInt(inputString);

            // Exemplo de uso do número obtido
            JOptionPane.showMessageDialog(null, "Você digitou: " + numero, "Resultado", JOptionPane.INFORMATION_MESSAGE);

        } catch (NumberFormatException e) {
            // Trata o erro se o usuário digitar algo que não é um número inteiro válido
            JOptionPane.showMessageDialog(null, "Entrada inválida! Por favor, digite apenas números inteiros.", "Erro de Entrada", JOptionPane.ERROR_MESSAGE);
        }

    }
}
