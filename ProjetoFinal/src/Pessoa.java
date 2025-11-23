public class Pessoa {
    protected String nome;
    protected int idade;
    protected String sexo;
    protected float experiencia;

    protected void ganharExp(float experiencia){
        this.experiencia += experiencia;
    }
}
