import java.util.Scanner;

public class CondicaoComposta {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        System.out.print("\nDigite o seu ano de nascimento: ");
        int anoNascimento = teclado.nextInt();
        int idade = 2025 - anoNascimento;
        String situacao;

        System.out.printf("\nSua idade é %d anos", idade);

        if (idade >= 18){
            situacao = "Maior de idade";
        } else {
            situacao = "Menor de idade";
        }
        System.out.printf("\nSituação: %s.\n\n", situacao);

        teclado.close();
    }
}
