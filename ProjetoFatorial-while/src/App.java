import java.util.Scanner;

public class App {
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);

        System.out.print("Digite um número: ");
        int numero = teclado.nextInt();
        
        int cc = numero;
        int resultado = 1;

        /*while (cc > 1) {          // aqui foi como eu fiz
            if (cc == numero){
                cc--;
                resultado = numero * cc;
            } else{
                cc--;
                resultado *= cc;
            }
        }*/
        
        while (cc >=1){     //aqui foi como o guanarabara fez
            resultado *= cc;
            cc--;
        }
        System.out.println(resultado);
        teclado.close();
    }
}