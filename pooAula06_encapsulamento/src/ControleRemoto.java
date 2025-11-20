public class ControleRemoto implements Controlador{
    //declarando os atributos
    private int volume;
    private boolean ligado;
    private boolean tocando;

    // Métodos especiais
    public ControleRemoto(){
        this.volume = 50;
        this.ligado = false;
        this.tocando = false;
    }

    private int getVolume(){
        return this.volume;
    }

    private void setVolume(int volume){
        this.volume = volume;
    }

    private boolean isLigado(){
        return this.ligado;
    }

    private void setLigado(boolean ligado){
        this.ligado = ligado;
    }

    private boolean isTocando(){
        return this.tocando;
    }

    private void setTocando(boolean tocando){
        this.tocando = tocando;
    }

    //Métodos Abstratos

    @Override
    public void ligar() {
        this.setLigado(true);
    }

    @Override
    public void desligar() {
        this.setLigado(false);
    }

    @Override
    public void abrirMenu() {
        System.out.println("---- MENU ----");
        System.out.println("Está ligado? " + this.isLigado());
        System.out.println("Está tocando? " + this.isTocando());
        System.out.println(this.getVolume());
        for(int i = 0; i <= this.getVolume(); i+=10){
            System.out.print("|");
        }
        System.out.println("");
    }

    @Override
    public void fecharMenu() {
        // no vídeo ele pulou esse método
    }

    @Override
    public void maisVolume() {
        if (this.isLigado()){
            this.setVolume(this.getVolume() + 5);
        } else{
            System.out.println("Impossível aumentar volume.");
        }
    }

    @Override
    public void menosVolume() {
        if(this.isLigado()){
            this.setVolume(getVolume() - 5);
        } else {
            System.out.println("Impossível diminuir volume.");
        }
    }

    @Override
    public void ligarMudo() {
        if(this.isLigado() && this.getVolume() > 0){
            this.setVolume(0);
        }
    }

    @Override
    public void desligarMudo() {
        if(this.isLigado() && this.getVolume() == 0){
            this.setVolume(50);
        }
    }

    @Override
    public void play() {
        if(this.isLigado() && !(this.isTocando())){
            this.setTocando(true);
        } else {
            System.out.println("Não consegui reproduzir.");
        }
    }

    @Override
    public void pause() {
        if(this.isLigado() && this.isTocando()){
            this.setTocando(false);
        } else{
            System.out.println("Não consegui pausar.");
        }
    }


    
}
/*
 * Nos métodos especiais, toda vez que se tratar de um boolean. Os métodos getters devem ser nomeados começando por 'is'. (não que com o get dê erro, mas a regra diz que devem ser assim)
 * 
 * Para criar os métodos abstratos, devemos fazer a ligacao da minha classe 'ControleRemoto' com a minha interface. Para isso, na linha de declaração da Classe 'ControleRemoto' eu acrescento o comando 'implements Controlador'. 
 * 
 * Como a interface foi definida com métodos abstratos, quando eu fizer a implmentação dela na minha classe 'ControleRemoto' eu vou ter que fazer todos os métodos que estão contidos na interface. Para fazer isso de maneira rápida, é só ir no warning da classe e pedir para gerar os métodos.
 * 
 * todos os métodos são criados e antes deles, é colocado o @override. 
 * Override significa 'Sobreescrever'. Isso significa que eu já tinha um método definido (que era o método abstrato) e agora eu estou sobreescrevendo, isto é, estou desconsiderando aquela programação que tinha sido feita e agora vou programar cada um deles. 
*/