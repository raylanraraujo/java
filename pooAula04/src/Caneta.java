public class Caneta {
    public String modelo;
    private float ponta;
    private boolean tampada;
    private String cor;

    public Caneta(String m, float p){// o método que tem o mesmo nome da sua classe é o método construtor.
        setModelo(m);
        setPonta(p);
        this.tampar();
    }

    public String getModelo(){ //como retorna uma String temos que mudar o void para String
        return this.modelo;
    }

    public void setModelo(String m){ // nao retorna nada entao temos que usar o void
        this.modelo = m;
    }

    public float getPonta(){ //retorna um valor float por isso substiuimos o void por float
        return this.ponta;
    }

    public void setPonta(float p){
        this.ponta = p;
    }

    public boolean getTampada(){
        return this.tampada;
    }

    public void setTampada(boolean t){
        this.tampada = t;
    }

    public String getCor(){
        return this.cor;
    }

    public void setCor(String c){
        this.cor = c;
    }

    public void tampar(){
        this.tampada = true;
    }

    public void destampar(){
        this.tampada = false;
    }

    public void status(){
        System.out.println("Sobre a caneta: ");
        System.out.println("Modelo: "+ this.getModelo());
        System.out.println("Ponta: "+ this.ponta);
        System.out.println("Cor: " + this.getCor());
        System.out.println("Está tampada: " + this.getTampada());
    }
}
