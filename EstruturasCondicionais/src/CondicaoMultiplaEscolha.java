import java.util.Scanner;

public class CondicaoMultiplaEscolha {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("\nDigite a quantidade de pernas: ");
        int pernas = teclado.nextInt();
        String personagem;
        switch (pernas) {
            case 1:
                personagem = "Saci";
                break;
            case 2:
                personagem = "Curupira";
                break;
            case 4:
                personagem = "Mula-Sem-Cabeça";
                break;
            case 6, 8:
                personagem = "Viúva-Negra";
                break;
            default:
                personagem = "E.T.";
                break;
        }
        System.out.printf("\nQuantidade de pernas: %d\nPersonagem: %s\n\n", pernas, personagem);
        teclado.close();
    }
}
