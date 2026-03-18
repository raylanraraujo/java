public class App {
    public static void main(String[] args) throws Exception {
        Hash hash = new Hash(5);

        hash.inserir(new Contato(15, "Moema", "999995555"));
        hash.inserir(new Contato(24, "Francisco", "999994444"));
        hash.inserir(new Contato(53, "Maria", "999993333"));
        hash.inserir(new Contato(12, "Roberta", "999992222"));
        hash.inserir(new Contato(74, "Heitor", "999991111"));
        hash.inserir(new Contato(22, "Marina", "999990000"));

        System.out.println(hash);
    }
}
