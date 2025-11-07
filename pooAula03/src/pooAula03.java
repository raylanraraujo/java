public class pooAula03 {
    public static void main(String[] args) {
        Caneta c1 = new Caneta();
        c1.modelo = "BIC cristal";
        c1.cor = "Azul";
        //c1.ponta = 0.5f;
        c1.carga = 90;
        //c1.tampada = true;
        c1.destampar();
        c1.status();
        c1.rabiscar();
    }
}

//Dentro da classe principal (main) eu tenho um objeto c1 que está usando a classe caneta. Entao o atributo protegido vai ser possivel de ser manipulado porque ele está dentro de uma classe que utilzia a classe Caneta. Sendo assim eu consigo alterar a carga e o tampada. Portanto no meu método main eu nao consigo mexer nos atributos que sao ditos privados. 

// Mesmo que o atributo tampada seja privado, eu consigo chamar os métodos publicos de tampar e destampar e dentro do bloco de código desses métodos eu to alterando o atributo tampada, pois só quem pode mexer em atributos privados é a propria classe. 