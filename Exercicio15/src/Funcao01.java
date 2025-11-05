public class Funcao01 {
    public static void main(String[] args) throws Exception {
        Fatorial f = new Fatorial(); //cria (instancia) um novo objeto da classe Fatorial na memória que é armazenado na variável f
        f.setValor(5);
        System.out.print(f.getFormula());
        System.out.printf("%d \n",f.getFatorial());
    }
}
