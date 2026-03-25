public class Node {
    String palavra;
    Node anterior;
    Node proximo;

    public String getPalavra() {
        return palavra;
    }

    public void setPalavra(String palavra) {
        this.palavra = palavra;
    }

    public Node getAnterior() {
        return anterior;
    }

    public void setAnterior(Node anterior) {
        this.anterior = anterior;
    }

    public Node getProximo() {
        return proximo;
    }

    public void setProximo(Node proximo) {
        this.proximo = proximo;
    }

    Node (String palavra) {
        this.palavra = palavra;
        this.proximo = null;
    }


    public String getValor() {
        return palavra;
    }
}
