public class OperadorTernario {
    public static void main(String[] args) throws Exception {
        int n1 , n2, r;
        n1 = 14;
        n2 = 18;
        r = n1 > n2? n1 + n2 : n1 - n2;

        //System.out.println(r);

        String nome1 = "Raylan";
        String nome2 = "Raylan";
        String nome3 = new String("Raylan");
        String res1_2 = (nome1 == nome2)? "igual" : "diferente";
        String res1_3 = (nome1 == nome3) ? "igual" : "diferente";

        //System.out.println(res1_2);
        //System.out.println(res1_3);

        int x , y , z;
        x = 4;
        y = 7;
        z = 12;
        boolean resultado;
        resultado = (x < y || y == z )? true : false;

        System.out.println(resultado);
    }
}
