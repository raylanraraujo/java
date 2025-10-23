public class OperadoresAritmeticos {
    public static void main(String[] args) throws Exception {
        /*int n1 = 3;
        int n2 = 5;
        float m = (n1 + n2) / 2;
        System.out.println("A média do aluno é " + m);*/

        /*int numero = 5;
        int valor = 5 + ++numero;
        System.out.println(valor); // Saída 10
        System.out.println(numero); // Saída 6*/

        /*int x = 4;
        x += 2; // x = x + 2
        System.out.println(x); // Saída 6*/

        float v = 8.5f;
        int arBaixo = (int) Math.floor(v);
        int arCima = (int) Math.ceil(v);
        int arredondamento = (int) Math.round(v);
        System.out.println(arBaixo); // 8
        System.out.println(arCima); // 9 
        System.out.println(arredondamento);



    }
}
