public class App {
    public static void main(String[] args) throws Exception {
        //Pessoa p1 = new Pessoa(); -> essa linha dá erro pois a classe Pessoa é abstrata.
        Visitante v1 = new Visitante();
        v1.setNome("Juvenal");
        v1.setIdade(22);
        v1.setSexo("masculino");
        System.out.println(v1);

        Aluno a1 = new Aluno();
        a1.setNome("Claudio");
        a1.setIdade(16);
        a1.setSexo("masculino");
        a1.setMatricula(111);
        a1.setCurso("Informática");
        a1.pagarMensalidade();
    }
}
