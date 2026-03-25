import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class ArvoreBinaria {
    // Raiz da árvore
    NodeArvore raiz;

    public boolean estaVazia() {
        return raiz == null;
    }


    // Retorna a altura de um nó
    int altura(NodeArvore n) {
        if (n == null)
            return 0;
        return n.altura;
    }


    // Calcula a diferença entre altura esquerda e direita
    int fatorBalanceamento(NodeArvore n) {
        if (n == null)
            return 0;
        return altura(n.esquerdo) - altura(n.direito);
    }


    //  ROTAÇÃO À DIREITA (RD)
    NodeArvore rotacaoDireita(NodeArvore y) {

        NodeArvore x = y.esquerdo;  // x sobe
        NodeArvore T2 = x.direito;  // subárvore temporária

        // Faz rotação
        x.direito = y;
        y.esquerdo = T2;

        // Atualiza alturas (primeiro o nó de baixo)
        y.altura = 1 + Math.max(altura(y.esquerdo), altura(y.direito));
        x.altura = 1 + Math.max(altura(x.esquerdo), altura(x.direito));

        // Retorna novo topo
        return x;
    }


    //  ROTAÇÃO À ESQUERDA (RE)
    NodeArvore rotacaoEsquerda(NodeArvore x) {

        NodeArvore y = x.direito;  // y sobe
        NodeArvore T2 = y.esquerdo;

        // Faz rotação
        y.esquerdo = x;
        x.direito = T2;

        // Atualiza alturas
        x.altura = 1 + Math.max(altura(x.esquerdo), altura(x.direito));
        y.altura = 1 + Math.max(altura(y.esquerdo), altura(y.direito));

        return y;
    }


    // INSERÇÃO
    public void inserir(String palavra) {
        raiz = inserir(raiz, palavra);

    }


    //  INSERÇÃO RECURSIVA (AVL)
    private NodeArvore inserir(NodeArvore no, String palavra) {

        //  remove espaços em branco
        palavra = palavra.trim();

        //  Inserção normal de árvore binária
        if (no == null) {
            return new NodeArvore(palavra);
        }
        int comparacao = palavra.compareToIgnoreCase(no.palavra);

        if (comparacao < 0) {
            no.esquerdo = inserir(no.esquerdo, palavra);
        }
        else if (comparacao > 0) {
            no.direito = inserir(no.direito, palavra);
        }
        else {
            return no;
        }

        //  Atualiza altura
        no.altura = 1 + Math.max(altura(no.esquerdo), altura(no.direito));

        //  Calcula fator de balanceamento
        int balance = fatorBalanceamento(no);


        //  Caso RD
        if (balance > 1 && palavra.compareToIgnoreCase(no.esquerdo.palavra) < 0)
            return rotacaoDireita(no);

        //  Caso RE
        if (balance < -1 && palavra.compareToIgnoreCase(no.direito.palavra) > 0)
            return rotacaoEsquerda(no);

        //  Caso LR rotação à esquerda no filho esquerdo e rotação à direita no nó principal
        if (balance > 1 && palavra.compareToIgnoreCase(no.esquerdo.palavra) > 0) {
            no.esquerdo = rotacaoEsquerda(no.esquerdo);
            return rotacaoDireita(no);
        }

        //  Caso RL rotação à direita no filho direito e rotação à esquerda no nó principal
        if (balance < -1 && palavra.compareToIgnoreCase(no.direito.palavra) < 0) {
            no.direito = rotacaoDireita(no.direito);
            return rotacaoEsquerda(no);
        }

        return no;
    }

    // Imprime em ordem alfabética
    public void emOrdem() {
        emOrdem(raiz);
    }

    private void emOrdem(NodeArvore no) {
        if (no != null) {
            emOrdem(no.esquerdo);
            System.out.println(no.palavra + " (altura: " + no.altura + ")");
            emOrdem(no.direito);
        }
    }

    // Método público para facilitar a chamada
    public void mostrarEstrutura() {
        mostrarEstrutura(raiz, null, "Raiz");
    }

    // Método privado recursivo
    private void mostrarEstrutura(NodeArvore no, NodeArvore pai, String posicao) {
        if (no != null) {
            // Exibe as informações do nó atual
            if (pai == null) {
                System.out.println(no.palavra + " é a [Raiz] (Altura: " + no.altura + ")");
            } else {
                System.out.println(no.palavra + " está à [" + posicao + "] de " + pai.palavra + " (Altura: " + no.altura + ")");
            }

            // Chamadas recursivas passando o nó atual como pai do próximo nível
            mostrarEstrutura(no.esquerdo, no, "Esquerda");
            mostrarEstrutura(no.direito, no, "Direita");
        }
    }

    //parte do sha-1 do site
    private String sha1(String input) {
        try {
            MessageDigest mDigest = MessageDigest.getInstance("SHA1");
            byte[] result = mDigest.digest(input.getBytes());

            StringBuilder sb = new StringBuilder();

            for (int i = 0; i < result.length; i++) {
                sb.append(
                        Integer.toString((result[i] & 0xff) + 0x100, 16).substring(1)
                );
            }

            return sb.toString();

        } catch (NoSuchAlgorithmException e) {
            throw new RuntimeException(e);
        }
    }

    public String calcularHash() {
        return calcularHash(raiz);
    }

    //método calcular hashe
    private String calcularHash(NodeArvore no) {

        if (no == null) {
            return "";
        }
        //  Se for folha
        if (no.esquerdo == null && no.direito == null) {
            return sha1(no.palavra);
        }

        String hashEsquerda = "";
        String hashDireita = "";

        if (no.esquerdo != null) {
            hashEsquerda = calcularHash(no.esquerdo);
        }
        if (no.direito != null) {
            hashDireita = calcularHash(no.direito);
        }
        String combinado = hashEsquerda + hashDireita + sha1(no.palavra);
        return sha1(combinado);
    }
}
