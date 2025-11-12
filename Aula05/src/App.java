public class App {
    public static void main(String[] args) throws Exception {
        Conta conta1 = new Conta();
        conta1.setNumero(1111);
        conta1.setDono("Jubileu");
        conta1.abrirConta("CC");
        
        Conta conta2 = new Conta();
        conta2.setNumero(2222);
        conta2.setDono("Creuza");
        conta2.abrirConta("CP");
        
        conta1.depositar(100);
        conta2.depositar(500);

        conta1.sacar(150);
        conta1.fecharConta();

        conta1.estadoAtual();
        conta2.estadoAtual();

        //conta1.abrirConta("CP");
        //conta1.sacar(200);
        //conta1.fecharConta();
        //conta1.depositar(33);
       // conta1.sacar(182);
        //System.out.println(conta1);
    }
}
