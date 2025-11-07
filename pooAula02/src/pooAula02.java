public class pooAula02 {
    public static void main(String[] args) throws Exception {
        Caneta c1 = new Caneta(); //instanciando a classe Caneta num novo objeto c1
        
        //Depois de instanciar eu posso mecher nos atributos desse objeto
        c1.cor = "azul";
        c1.ponta = (float) 0.5; //ou  c1.ponta = 0.5f;
        c1.carga = 90;
        c1.tampar();
        c1.status();
        c1.rabiscar();

        Caneta c2 = new Caneta(); //intanciando um segundo objeto da classe Caneta
        c2.modelo = "Bic";
        c2.cor = "Preta";
        c2.ponta = 1.0f;
        c2.carga = 85;
        c2.destampar();
        c2.status();
        c2.rabiscar();
    }
}

