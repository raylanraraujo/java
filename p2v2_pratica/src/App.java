public class App {
    public static void main(String[] args) throws Exception {
        
        // No n = new No(); //criando o elemento da Fila criado
        // No n1 = new No();

        // n.info = 5;
        // n.proximo = n1;

        // n1.info = 10;
        // n1.proximo = null;

        // System.out.println(n.info);
        // System.out.println(n.proximo.info);

        // Fila f = new Fila();     //criando a minha fila
        // f.inicio = n;            //definindo o inicio da fila em n
        // f.fim = n1;              //definindo o fim da fila em n1

        ManipuladorFila manipulador = new ManipuladorFila();
        Fila f = manipulador.criar();
        manipulador.insere(f, 12f);
        manipulador.insere(f, 18f);
        manipulador.insere(f, 23f);
        manipulador.insere(f, 5f);
        System.out.println(f.inicio.info + " e " + f.fim.info);
        manipulador.imprime(f);
        float x = manipulador.retira(f);
        System.out.println("o elemento de valor " + x + "foi retirado da Fila.");
        System.out.println("Inicio: " + f.inicio.info + " e Fim: " + f.fim.info);
        manipulador.imprime(f);        
        System.out.println("o elemento de valor " + manipulador.retira(f) + "foi retirado da Fila.");
        System.out.println("Inicio: " + f.inicio.info + " e Fim: " + f.fim.info);
        manipulador.imprime(f);        
        System.out.println("o elemento de valor " + manipulador.retira(f) + "foi retirado da Fila.");
        System.out.println("Inicio: " + f.inicio.info + " e Fim: " + f.fim.info);
        manipulador.imprime(f);        
        System.out.println("o elemento de valor " + manipulador.retira(f) + "foi retirado da Fila.");
        System.out.println("Inicio: " + f.inicio + " e Fim: " + f.fim);
        manipulador.imprime(f);
        System.out.println("o elemento de valor " + manipulador.retira(f) + "foi retirado da Fila.");
        
    }
}
