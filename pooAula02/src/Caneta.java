public class Caneta {
    String modelo;
    String cor;
    float ponta;
    int carga;
    boolean tampada;

    // para mostrar o estado do objeto
    void status(){
        System.out.println("\nModelo: " + this.modelo); //a palavra this significa autorreferencia - quem chamou o método status() vai ser substituido no this
        System.out.println("Cor: " + this.cor);
        System.out.println("Ponta: "+ this.ponta);
        System.out.println("Carga: " + this.carga);
        System.out.println("Tampada: " + this.tampada);
        
    }
   void rabiscar(){
    if (this.tampada == true) {
        System.out.println("\nERRO! Não posso rabiscar");
    } else {
        System.out.println("\nEstou rabiscando");
    }
   }

   void tampar() {
    this.tampada = true;
   }

   void destampar() {
    this.tampada = false;
   }
}
/*
 * Assim eu tenho a classe Caneta criada e eu posso usar ela dentro de qualquer arquivo dentro do meu pacote pooAula02.
 * Tendo essa classeu, eu posso instanciar em um objeto
 * 
 * this
 * é uma referencia ao proprio objeto que chamou. 
 * Sempre que quiser modificar algum atributo dentro da propria classe coloque a palavra this na frente da linha que vai mecher no actributo.
*/
//
