import java.util.Scanner;

public class TiposPrimitivos {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Digite o nome do aluno: "); //exibe na tela o que é preciso que o usuário digite
        String nome = teclado.nextLine(); //serve para ler a entrada String do usuario pelo teclado
        System.out.format("Digite a nota do %s: ", nome); //exibe na tela o que é preciso que o usuário digite
        float nota = teclado.nextFloat(); //serve para ler a entrada Float do usuario pelo teclado
        System.out.format("\nA nota de %s é %.2f.\n", nome, nota); //Exibe o resultado final com todas as informações
    }
}
