public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

        Conta conta1 = new Conta();

        conta1.abrirConta("CP");
        //conta1.sacar(200);
        //conta1.fecharConta();
        conta1.depositar(33);
        System.out.println(conta1);
    }
}
