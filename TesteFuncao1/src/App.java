public class App {


    static void soma ( int a,int b){ //aqui estamos criando um procedimento - método estático
        int s = a + b;
        System.out.println("A soma é: " + s);
    }

    static int subtracao (int a, int b){ // aqui estamos criando
        int sub = a - b;
        return sub;
    }

    public static void main(String[] args) throws Exception {
        System.out.println("Começou o programa.");
        
        soma(5,2);

        System.out.printf("A subtração entre A e B é: " + subtracao(5,2));
    }
}
