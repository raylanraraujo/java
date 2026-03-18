public class Contato {
    int codigo;         // código contato
    String nome;        //
    String telefone;

    //método construtor que recebe os tres parâmetros
    Contato(int codigo, String nome, String telefone){
        this.codigo = codigo;
        this.nome = nome;
        this.telefone = telefone;
    }

    @Override
    public String toString() {
        return "(" + codigo + ", " + nome + ")";
    }
    
}
