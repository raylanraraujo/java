public class App {
    public static void main(String[] args) throws Exception {
        //Pessoa p1 = new Pessoa(); -> essa linha dá erro pois a classe Pessoa é abstrata.
        Visitante v1 = new Visitante();
        v1.setNome("Juvenal");
        v1.setIdade(22);
        v1.setSexo("masculino");
        System.out.println(v1);
    }
}
