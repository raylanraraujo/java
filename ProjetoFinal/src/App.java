public class App {
    public static void main(String[] args) throws Exception {
        Video v[] = new Video[3];

        v[0]=new Video ("Aula 01 de POO");
        v[1] = new Video("Aula 02 de POO");
        v[2] = new Video("Aula 03 de POO");

        Gafanhoto g[] = new Gafanhoto[2];
        g[0] = new Gafanhoto("Jubileu", 22, "M", "juba");
        g[1] = new Gafanhoto("Creuza", 20, "F", "creuzita");

        System.out.println(g[0].toString());
    }
}
