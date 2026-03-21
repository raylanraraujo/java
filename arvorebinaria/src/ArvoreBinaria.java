public class ArvoreBinaria {
    private Node root;  //esse é o unico atributo chamado "root" que é do tipo Node

    public Boolean isEmpty(){
        if(root == null){
            return true;
        }
        return false;
    }

    public int getAltura(){
        return getAltura(this.root);
    }

    private int getAltura(Node root){
        if(root==null){
            return 0;
        }
        int altEsq = getAltura(root.getNodeEsquerdo());
        int altDir = getAltura(root.getNodeDireito());
        if(altEsq > altDir){
            return altEsq + 1;
        } else {
            return altDir + 1;
        }
    }

    public int getQntNode(){
        return getQtdNode(root);
    }

    private int getQtdNode(Node root){
        if(root == null){
            return 0;
        }
        int qtdNodeEsq = getQtdNode(root.getNodeEsquerdo());
        int qtdNodeDir = getQtdNode(root.getNodeDireito());
        return qtdNodeEsq + qtdNodeDir + 1;
    }

    public void imprimirArvore(){
        if(this.root == null){
            System.out.println("Árvore vazia");
        } else {
            imprimirArvore(this.root);
        }
    }

    //impressao realizada em ordem
    private void imprimirArvore(Node node){
        //pre ordem
        //System.out.println("Nó " + node.getValor());
        if(node.getNodeEsquerdo() != null){
            imprimirArvore(node.getNodeEsquerdo());
        }
        //in order
        //System.out.println("Nó " + node.getValor());

        if(node.getNodeDireito() != null){
            imprimirArvore(node.getNodeDireito());
        }
        //pos order
        System.out.println("Nó " + node.getValor());

    }

    public void inserir(int valor){
        inserir(this.root, valor);
    }
    
    public void inserir(Node node, int valor){
        if(this.root == null){
            this.root = new Node(valor);
        } else {
            if(valor < node.getValor()){
                if(node.getNodeEsquerdo() != null){
                    inserir(node.getNodeEsquerdo(), valor);
                } else {
                    //se o nodo esquerdo vazio insere o novo aqui
                    node.setNodeEsquerdo(new Node(valor));
                }
                // verifica se o valor a ser inserido é maior que o nó corrente da árvore
            } else if (valor > node.getValor()) {
                // se tiver elemento no nó direito continua a busca
                if(node.getNodeDireito() != null){
                    inserir(node.getNodeDireito(), valor);
                } else {
                    //se nodo direito vazio insere o novo no aqui
                    node.setNodeDireito(new Node(valor));
                }
            }
        } 
    }

    public Node remover(int valor) throws Exception{
        return remover(this.root, valor);
    }

    private Node remover(Node node, int valor) throws Exception {
        if (this.root == null) {
            throw new Exception("Árvore vazia");
        } else {
            if (valor < node.getValor()) {
                node.setNodeEsquerdo(remover(node.getNodeEsquerdo(), valor));
            } else if (valor > node.getValor()) {
                node.setNodeDireito(remover(node.getNodeDireito(), valor));
            } else if (node.getNodeEsquerdo() != null && node.getNodeDireito() != null) {
                /* 2 filhos */
                System.out.println(" Removeu No " + node.getValor());
                node.setValor(encontraMinimo(node.getNodeDireito()).getValor());
                node.setNodeDireito(removeMinimo(node.getNodeDireito()));
            } else {
                System.out.println(" Removeu No " + node.getValor());
                node = (node.getNodeEsquerdo() != null) ? node.getNodeEsquerdo() : node.getNodeDireito();
            }
            return node;
        }
    }

    private Node removeMinimo(Node node) {
    if (node == null) {
        System.out.println(" ERRO ");
    } else if (node.getNodeEsquerdo() != null) {
        node.setNodeEsquerdo(removeMinimo(node.getNodeEsquerdo()));
        return node;
    } else {
        return node.getNodeDireito();
    }
    return null;
    }

    private Node encontraMinimo(Node node){
        if (node != null){
            while (node.getNodeEsquerdo() != null){
                node = node.getNodeEsquerdo();
            }
        }
        return node;
    }

}
