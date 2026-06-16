import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args)

            throws IOException {
        String CaminhoArquivo = "/Users/raylanaraujo/Documents/estudos/CursoEmVideo/java/ProjetoED/content/Inteligência-Artificial.txt";
        BufferedReader leitor = null;
        try {
            FileReader leitorArquivo = new FileReader(CaminhoArquivo);
            leitor = new BufferedReader(leitorArquivo);

            String linha;

            Pilha<ArvoreBinaria> pilhaArvores = new Pilha<>();


            while ((linha = leitor.readLine()) != null) {
                ListaDupla lista01 = new ListaDupla();
                ArvoreBinaria arvore = new ArvoreBinaria();

                String[] palavras = linha.split("\\s+");

                for (int i = 0; i < palavras.length ; i++) {
                    lista01.inserirNoFinal(palavras[i]);
                }

                Node atual = lista01.getFim();

                while (atual != null) {
                    arvore.inserir(atual.getValor());
                    atual = atual.getAnterior();
                }

                //arvore.mostrarEstrutura();

                pilhaArvores.push(arvore);
                //System.out.println("Empilhei uma árvore");

            }

            while (!pilhaArvores.isEmpty()) {

                ArvoreBinaria arvore = pilhaArvores.pop();

                String hashFinal = arvore.calcularHash();

                System.out.println(hashFinal);
            }
        }
        catch (Exception erro) {
            System.out.println("erro no arquivo");
            System.out.println(erro.getMessage());
        }
        finally {
            if (leitor != null) {
                try {
                    leitor.close();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }
}