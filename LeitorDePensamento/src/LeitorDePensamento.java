import java.util.Scanner;

public class LeitorDePensamento {
    public static void main(String[] args) throws Exception {
        int min = 1;
        int max = 6;
        double numero = min + Math.random() * (max - min);
        int sorteado = (int) Math.floor(numero);
        
        Scanner entrada = new Scanner(System.in); // cria o leitor

        System.out.print("Tente acerter o número entre 1 e 5 que pensei: ");
        int chute = entrada.nextInt();

        if (sorteado == chute){
            System.out.println("Parabens, Voce Acertou!");
        } else{
            System.out.printf("Pena, voce errou. O número sorteado é %d%n", sorteado);
        }
    }
}
