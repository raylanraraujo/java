public class Fatorial {

    //a minha classe tem esses 3 atributos
    private int numero = 0; //número o qual eu quero calcular o fatorial
    private int fatorial = 1; // o resultaado do fatorial do número
    private String formula= ""; // uma string com a fórmula


    public void setValor(int n){
        numero = n; //o valor passado como parâmetro será atribuido ao atributo numero
        
        int f = 1; //criado para auxiliar no cálculo do fatorial do número
        String s = "";
        for (int c = numero; c > 1; c--){ //loop para fazer o calculo do fatorial
            f *= c;
            s += c + " x ";
        }
        s += "1 = "; //serve para incluir o valor de 1 no final da fórmula já que pelo loop ele não irá aparecer.
        fatorial = f;
        formula = s;
    }

    public int getFatorial() {
        return fatorial;
    }

    public String getFormula(){
        return formula;
    }
}
