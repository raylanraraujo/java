public class Peixe extends Animal {
    private String corEscama;
    
    public void soltarBolha(){
        System.out.println("Soltou uma bolha");
    }

    public String getCorEscama(){
        return corEscama;
    }

    public void setCorEscama(String corEscama){
        this.corEscama = corEscama;
    }



    @Override
    public void locomover() {
        System.out.println("Nadando");
    }



    @Override
    public void alimentar() {
        System.out.println("Comendo subtâncias");
    }



    @Override
    public void emitirSom() {
        System.out.println("Peixe nõa faz som");
    }
}
