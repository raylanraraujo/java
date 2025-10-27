import java.util.Scanner;

public class CondicaoSimples {
    public static void main(String[] args) throws Exception {

        Scanner teclado = new Scanner(System.in); // a variável "teclado" armazena um novo objeto Scanner que receberá entradas digitadas pelo usuário

        System.out.print("\nDigite a 1ª nota: ");
        float nota1 = teclado.nextFloat();
        System.out.print("Digite a 2ª nota: ");
        float nota2 = teclado.nextFloat();
        float media = (nota1 + nota2) / 2;
        System.out.print("\nSua média foi " + media);
        if (media >9){
            System.out.println(" - Parabéns!\n");
        }
        teclado.close(); // faz o fechamento do recurso "System.in" que foi aberto para receber entradas do usuário. 
    }
}
