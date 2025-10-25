import java.util.Scanner;

public class LeitorDePensamento {
    public static void main(String[] args) throws Exception {
        int min = 1;
        int max = 6;
        double numero = min + Math.random() * (max - min);
        int sorteado = (int) numero;
        
        Scanner entrada = new Scanner(System.in); // cria o leitor

        System.out.print("Tente acerter o número entre 1 e 5 que pensei: ");
        int chute = entrada.nextInt();
        entrada.close(); //serve para fechar o objeto entrada


        String res = (sorteado == chute)? "Parabens, Voce Acertou!" : String.format("Pena, voce errou. O número sorteado é %d%n", sorteado); // verifica se o palpite é igual ao numero randomico. Se igual, improme primeira String, se nao imprime a segunda String formatada e diz o valor sorteado.
        System.out.println(res);
    }
}
