public class Node {
    private Integer valor;
    private Node nodeEsquerdo;
    private Node nodeDireito;

    public Node () {}       //construtor vazio


    public Node (Integer valor){ //outro construtor com atribuição de valor
        super();
        this.valor = valor;
    }


    public Integer getValor() {
        return valor;
    }


    public void setValor(Integer valor) {
        this.valor = valor;
    }


    public Node getNodeEsquerdo() {
        return nodeEsquerdo;
    }


    public void setNodeEsquerdo(Node nodeEsquerdo) {
        this.nodeEsquerdo = nodeEsquerdo;
    }


    public Node getNodeDireito() {
        return nodeDireito;
    }


    public void setNodeDireito(Node nodeDireito) {
        this.nodeDireito = nodeDireito;
    }


    @Override
    public String toString() {
        return "No [valor = " + valor + "]";
    }

    
}
