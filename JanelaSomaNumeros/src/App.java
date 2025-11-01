import javax.swing.JOptionPane;

public class App {
    public static void main(String[] args) throws Exception {
        
        int soma = 0, numero, total = 0, pares = 0, impares = 0, maior = 0, media = 0;
        do {
            String entrada = JOptionPane.showInputDialog(null,
             "<html>Digite um número: <br><em>(0 para interromper)</em></html>");
            numero = Integer.parseInt(entrada);
            
            if (numero == 0) {
                continue;
            }else {
                total++;
            }

            if (numero %2 == 0) {
                pares++;
            } else {
                impares++;
            }

            if (numero > 100){
                maior++;
            }

            soma += numero;
        } while(numero != 0);
        
        media = soma / total;

        JOptionPane.showMessageDialog(null, 
        "<html>"+
        "<b>Resultado</b><hr>"
        +"Total de valores: " + total + "<br>"
        +"A soma é: " + soma + "<br>"
        +"Total de pares: " + pares + "<br>"
        +"Total de impares: " + impares + "<br>"
        +"Acima de 100: " + maior + "<br>"
        +"A média: " + media + "<br>"
        + "</html>", null, JOptionPane.INFORMATION_MESSAGE);
    }
}
//parei 12:52