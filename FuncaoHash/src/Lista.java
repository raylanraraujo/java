public class Lista {
    No inicio;      //  Ponteiro para.o inicio da lista
    int tamanho;    //  Tamanho da Lista

    public void inserir(Contato info) { // Método de inserir nó
        No no = new No();   // Cria um No
        no.info = info; // Atribui a informacao ao no
        no.proximo = inicio;    // O ponteiro proximo do no inserido
        inicio = no;    // O inicio passa a ser esse novo no
        tamanho++;  // Incremente o tamanho da lista
    }

    public Contato buscar(int codigo){      // Metodo buscar pelo codigo
        No no = inicio;                     // Vai para o inicio da lista
        while (no != null) {                // Enquanto o no nao for nulo
            if(no.info.codigo == codigo) {  // Se o codigo do no for igual ao p...
                return no.info;             // retorna a informacao do tipo Codigo
            }
            no = no.proximo;                // vai para o proximo no
        }
        return null;
    }

    @Override
    public String toString() {              // Sobrescreve o metodo toString
        String out = "";                    // Cria um string vazia para o retorno
        No no = inicio;                     // Vai para o inicio da lista
        while (no != null) {                // Enquanto o no for diferente de nulo
            out += no.info + " ";           // Adiciona a string a informacao 
            no = no.proximo;                // vai para o proximo no
        }
        
        return out;                         // retorna a string 
    }

    
}
