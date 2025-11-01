import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        int numero, soma = 0;
        String resposta;
        Scanner teclado = new Scanner(System.in);

        do {
            System.out.print("\nDigite um número: ");
            numero =  teclado.nextInt();
            soma += numero;
            System.out.print("\nQuer continuar (S/ N): ");
            resposta = teclado.next();
        } while(resposta.equals("S"));
        teclado.close();

        System.out.printf("\nA soma de todos os números é %d.\n", soma);
    }
}
