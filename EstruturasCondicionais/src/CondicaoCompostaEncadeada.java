import java.util.Scanner;

public class CondicaoCompostaEncadeada {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("\nDigite o seu ano nascimento: ");
        int nascimento = teclado.nextInt();

        int idade = 2025 - nascimento;
        String podeVotar;

        if (idade < 16) {
            podeVotar = "Não vota";
        } else {
            if ((idade >= 16 && idade < 18) || idade > 70){ //dizemos que é encadeado porque tem uma estrutura condicional dentro de outra
                podeVotar = "Opcional";
            } else {
                podeVotar = "Obrigatório";
            }
        }
        System.out.printf("Nascimento: %d\nIdade: %d\nVoto: %s\n" ,nascimento, idade, podeVotar);
        teclado.close();
    }
}
