public class App {
    public static void main(String[] args) throws Exception {
        Node n, n1, n2;

        n = new Node(10);
        n1 = new Node(4);
        n2 = new Node(3);

        n.setNodeEsquerdo(n1);
        n.setNodeDireito(n2);
        System.err.println(n);
        System.out.println(n.getNodeDireito());
        System.out.println(n.getNodeEsquerdo());
    }
}
