public class Livro implements Publicacao{
    //Atributos
    private String titulo;
    private String autor;
    private int totalPaginas;
    private int paginaAtual;
    private boolean aberto;
    private Pessoa leitor;

    //Metodos da classe
    public void detalhes(){}

    

    @Override
    public void abrir() {
        // TODO Auto-generated method stub
        
    }



    @Override
    public void avancarPagina() {
        // TODO Auto-generated method stub
        
    }



    @Override
    public void fechar() {
        // TODO Auto-generated method stub
        
    }



    @Override
    public void folhear() {
        // TODO Auto-generated method stub
        
    }



    @Override
    public void voltarPagina() {
        // TODO Auto-generated method stub
        
    }



    //Métodos especiais 
    public String getTitulo(){
        return this.titulo;
    }

    public void settitulo(String titulo){
        this.titulo = titulo;
    }

    public String getAutor(){
        return this.autor;
    }

    public void setAutor(String autor){
        this.autor = autor;
    }

    public int getTotalPaginas() {
        return totalPaginas;
    }

    public void setTotalPaginas(int totalPaginas) {
        this.totalPaginas = totalPaginas;
    }

    public int getPaginaAtual() {
        return paginaAtual;
    }

    public void setPaginaAtual(int paginaAtual) {
        this.paginaAtual = paginaAtual;
    }

    public boolean isAberto() {
        return aberto;
    }

    public void setAberto(boolean aberto) {
        this.aberto = aberto;
    }

    public Pessoa getLeitor() {
        return leitor;
    }

    public void setLeitor(Pessoa leitor) {
        this.leitor = leitor;
    }

    
}
