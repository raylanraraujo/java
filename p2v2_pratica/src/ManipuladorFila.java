public class ManipuladorFila {

    Fila criar(){ //metodo que cria a fila
        Fila f = new Fila();
        f.inicio = null;
        f.fim = null;
        return f;
    }


    No ins_fim(No fim, float v){
        No p = new No();
        p.info = v;
        p.proximo = null;
        if(fim !=null){ 
            fim.proximo = p;
        }
        return p;   
    }

    No ret_ini(No inicio){
        No p = inicio.proximo; //atualizando o inicio da fila
        return p; //retornando o inicio da fila
    }

    void insere(Fila f, float v){ //é passado a fila e o valor onde o dado será inserido
        f.fim = ins_fim(f.fim, v); // atualizar o fim da fila
        if(f.inicio == null){ //fazer uma verificação. Se o inicio foi null o inicio tambem será o no do fim.
            f.inicio = f.fim;
        }
    }

    float retira(Fila f){
        float v;
        if(vazia(f)){
            System.out.println("Fila vaiza");
            System.exit(1);
        }
        v = f.inicio.info;
        f.inicio = ret_ini(f.inicio);
        if(f.inicio == null){
            f.fim = null;
        }
        return v;
    }

    boolean vazia(Fila f){
        return (f.inicio == null);
    }

    void imprime(Fila f){
        No q;
        for(q = f.inicio; q!=null; q=q.proximo){
            System.out.println(q.info);
        }
    }
}
