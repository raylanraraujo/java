import java.util.Arrays;

public class Hash {
    int operador;                               // Atributo operador
    Lista[] vetor;                              // Vetor de Listas

    Hash(int operador){                         // Construtor inciando ocm um 
        this.operador = operador;               // inicializa o perador
        vetor = new Lista[operador];            // Inicializa o vetor de Lista
        for (int i = 0; i < operador; i++){
            vetor[i] = new Lista();             // inicializa a lista daquela 
        }
    }            
    
    void inserir(Contato contato){
        int chave = contato.codigo % operador;
        vetor[chave].inserir(contato);
    }

    Contato buscar (int codigo){                            // Metodo buscar pelo codigo
        return vetor[codigo % operador].buscar(codigo);     // buscar apenas na lista especifica
    }

    @Override
    public String toString() {                              // sobreescreve o metodo toString
        String out = "";                                    // cria uma string de saida
        for (int i = 0; i < operador; i++){                 // para cada posicao no vetor
            out += "" + i + ": ";                           // adicioa uma string repres...
            out += vetor[i % operador] + "\n";
        }
        return out;                                         // retorna a string de saida
    }

    
}
