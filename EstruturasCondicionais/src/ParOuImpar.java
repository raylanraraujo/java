import java.util.Scanner;

public class ParOuImpar {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("\nDigite um número: ");
        int numero = teclado.nextInt();
        
        String parImpar = numero % 2 == 0? "Par" : "Impar";
        
        /*if (numero % 2 == 0){
            parImpar = "PAR";
        } else {
            parImpar = "ÍMPAR";
        }*/
        
        System.out.printf("\nO número digitado foi: %d, portanto é um número %s. \n\n", numero , parImpar);

        teclado.close();

    }
}

//