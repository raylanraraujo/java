public class App {
    public static void main(String[] args) throws Exception {
       ArvoreBinaria b = new ArvoreBinaria();

       b.inserir(7);
       b.inserir(3);
       b.inserir(8);
       b.inserir(14);
       b.inserir(13);
       b.inserir(1);
       b.inserir(4);
       b.inserir(10);
       
       b.remover(8);
       
       b.imprimirArvore();
       System.out.println("Quantidade de nós: "+ b.getQntNode());
       System.out.println("Altura: " + b.getAltura());
    }
}
