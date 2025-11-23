public class App {
    public static void main(String[] args) throws Exception {
        //Animal x = new Animal(); classe abstrata não pode ser instanciável
        Cachorro m = new Cachorro();
       // m.emitirSom();
        m.reagir(2, 12.5f);
        m.reagir(17, 4.5f);
    }
}
