public class Livro implements Publicacao{
    //Atributos
    private String titulo;
    private String autor;
    private int totalPaginas;
    private int paginaAtual;
    private boolean aberto;
    private Pessoa leitor;

    //Metodos da classe
    public void detalhes(){
        System.out.println("======= Sorbre o livro =======");
        System.out.println("Título: "+ this.getTitulo());
        System.out.println("Autor: "+ this.getAutor());
        System.out.println("Total de páginas: " + this.getTotalPaginas());
        System.out.println("Página atual: " + this.getPaginaAtual());
        System.out.println("Página atual: " + this.getPaginaAtual());
        System.out.println("Aberto: " + this.isAberto());
        System.out.println("Leitor: " + this.getLeitor());
    }

    

    @Override
    public void abrir() {
        if(!isAberto()){
            this.setAberto(true);
        } else {
            System.out.println("O livro " + this.getTitulo() + "já está aberto.");
        }
        
    }



    @Override
    public void avancarPagina() {
        this.setPaginaAtual((this.getPaginaAtual() + 1));  
    }



    @Override
    public void fechar() {
        if(isAberto()){
            this.setAberto(false);
        } else {
            System.out.println("O livro " + this.getTitulo() + " já está fechado.");
        }
        
    }



    @Override
    public void folhear() {
        // TODO Auto-generated method stub
        
    }



    @Override
    public void voltarPagina() {
        this.setPaginaAtual((this.getPaginaAtual() - 1));
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
