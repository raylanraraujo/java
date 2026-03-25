public class Pilha<T> {

    private NodePilha<T> topo;

    public void push(T valor) {
        NodePilha<T> novo = new NodePilha<>(valor);
        novo.proximo = topo;
        topo = novo;
    }

    //serve para remover elementos
    public T pop() {
        if (topo == null) {
            throw new RuntimeException("Pilha vazia");
        }

        T valorRemovido = topo.valor;
        topo = topo.proximo;

        return valorRemovido;
    }

    //serve para mostrar o topo
    public T peek() {
        if (topo == null) {
            throw new RuntimeException("Pilha vazia");
        }

        return topo.valor;
    }

    //serve para saber se a pilha ta vazia
    public boolean isEmpty() {
        return topo == null;
    }
}