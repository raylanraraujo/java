import java.util.Scanner;

public class formaTriangulo {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("\nDigite o lado a: ");
        int a = teclado.nextInt();
        System.out.print("Digite o lado b: ");
        int b = teclado.nextInt();
        System.out.print("Digite o lado c: ");
        int c = teclado.nextInt();


        if ((a + b > c) || (a + c > b) || (b + c > a)){
            String tipo;

            if ((a == b) && ( b == c)){
                tipo = "EQUILÁTERO";
            } else if ((a == b) || (a == c) || (b == c)){
                tipo = "ISÓSCELES";
            } else {
                tipo = "ESCALENO";
            }
            System.out.printf("\nTringulo formado do tipo %s.\n\n", tipo);
        }        
        teclado.close();
    }
}
