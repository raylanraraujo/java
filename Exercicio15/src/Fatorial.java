public class Fatorial {

    //a minha classe tem esses 3 atributos
    private int numero = 0; //número o qual eu quero calcular o fatorial
    private int fatorial = 1; // o resultaado do fatorial do número
    private String formula= ""; // uma string com a fórmula

    public void setValor(int n){
        numero = n;
        int f = 1;
        for (int c = numero; c >= 1; c--){
            f *= c;
        }
    }
}
