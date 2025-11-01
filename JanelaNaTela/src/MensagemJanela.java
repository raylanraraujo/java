import javax.swing.JOptionPane;

public class MensagemJanela {

    public static void main(String[] args) {
        /* 
        // O showMessageDialog cria e exibe a janela.
        // O primeiro argumento (null) centraliza a janela na tela.
        // O segundo argumento é a mensagem principal.
        // O terceiro argumento é o título da janela.
        // O quarto argumento define o ícone (opcional, aqui é um ícone de informação).
        
        JOptionPane.showMessageDialog(
            null, 
            "Olá! Esta é uma mensagem em uma janela pop-up.", 
            "Mensagem do Programa", 
            JOptionPane.WARNING_MESSAGE
        );

         */

        int numero =Integer.parseInt(JOptionPane.showInputDialog(null, args, "Informe um número", 0));
        JOptionPane.showMessageDialog(null, "Voce digitou o valor" + numero);
        
        // Geralmente, é bom adicionar esta linha para garantir que o 
        // programa termine completamente, fechando todos os processos de interface gráfica.
        System.exit(0); 
    }
}