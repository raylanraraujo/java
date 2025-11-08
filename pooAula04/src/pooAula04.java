public class pooAula04 {
    public static void main(String[] args) {
        Caneta c1 = new Caneta("BIC", 1.0f); //cria um objeto da classe Caneta chamada c1
        
        c1.setModelo("Bic"); //modificação do atributo pelo método modificador
        c1.modelo = "Compactor"; // o atributo publico pode ser modificado diretamente sem a necessecidade do uso do método modificador set
        
        c1.setPonta(0.5f); //quando o valor é float tem que colocar um f no final. Valor modificado pelo método modificador set.
        //c1.ponta = 1.0f; // nesse caso já alerta um erro porque o atributo ponta é privado e só pode ser acessado atraves dos métodos modificadores. 

        c1.status();
        System.out.println("Tenho uma caneta " + c1.getModelo() + ". Sua ponta é " + c1.getPonta()); // estou exibindo os atributos do objeto mas o acesso a eles nao ocorre de maneira direta e sim através dos métodos acessores.
    }
}
