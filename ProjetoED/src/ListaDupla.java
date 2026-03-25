public class ListaDupla {
   private Node inicio;
   private Node fim;

    //get e set
   public Node getInicio() {
        return inicio;
    }

    public void setInicio(Node inicio) {
        this.inicio = inicio;
    }

    public Node getFim() {
        return fim;
    }

    public void setFim(Node fim) {
        this.fim = fim;
    }

    //método para inseriri no começo
    public void inserirNoInicio(String palavra) {

        Node novo = new Node(palavra);

        if (inicio == null) {
            inicio = novo;
            return;
        }

        novo.proximo = inicio;
        inicio.anterior = novo;
        inicio = novo;
    }

    public void inserirNoFinal(String valor) {

        Node novo = new Node(valor);

        if (inicio == null) {
            // lista vazia
            inicio = novo;
            fim = novo;
        } else {
            fim.proximo = novo;
            novo.anterior = fim;
            fim = novo;
        }
    }

    public void imprimirReverso() {

        Node atual = fim;

        while (atual != null) {
            System.out.println(atual.palavra);
            atual = atual.anterior;
        }
    }

    public void mostrarParaFrente() {

        Node atual = inicio;

        while (atual != null) {
            System.out.print(atual.palavra + " ⇄ ");
            atual = atual.proximo;
        }

        System.out.println("null");
    }

}
