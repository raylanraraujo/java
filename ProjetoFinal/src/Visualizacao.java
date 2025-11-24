public class Visualizacao {
    //atributos que fazem a relacao de agregacao entre as classes Gafanhoto e filme
    private Gafanhoto espectador;
    private Video filme;
    
    // construtuor da classe
    public Visualizacao(Gafanhoto espectador, Video filme) {
        this.espectador = espectador;
        this.filme = filme;
        this.espectador.setTotAssistido(this.espectador.getTotAssistido() + 1); //incrementar 1 no total assistido pelo espectador
        this.filme.setViews(this.filme.getViews() + 1); //para acresecentar 1 view no video
    }

    public Gafanhoto getEspectador(){
        return espectador;
    }

    public void setEspectador( Gafanhoto espectador){
        this.espectador = espectador;
    }

    public Video getFilme(){
        return filme;
    }

    public void setFilme(Video filme){
        this.filme = filme;
    }

    //aqui embaixo estamos dando uma sobrecarga no método
    public void avaliar(){
        this.filme.setAvaliacao(5);
    }

    public void avaliar(int nota){
        this.filme.setAvaliacao(nota);
    }

    public void avaliar(float porc){
        int tot = 0;
        if(porc <= 20){
            tot = 3;
        } else if (porc <= 50){
            tot = 5;
        } else if ( porc <= 90){
            tot = 8;
        } else {
            tot = 10;
        }
        this.filme.setAvaliacao(tot);
    }

    @Override
    public String toString() {
        return "Visualizacao [espectador=" + espectador + ", filme=" + filme + "]";
    }


    
}
