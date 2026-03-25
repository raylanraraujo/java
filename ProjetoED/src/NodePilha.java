public class NodePilha<T> {
    T valor;
    NodePilha<T> proximo;

    NodePilha(T valor) {
        this.valor = valor;
    }

    public T getValor() {
        return valor;
    }
}
