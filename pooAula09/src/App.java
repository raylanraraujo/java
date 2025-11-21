public class App {
    public static void main(String[] args) throws Exception {
        Pessoa[] pessoas = new Pessoa[2];
        Livro[] livros = new Livro[3];

        pessoas[0] = new Pessoa("Raylan", 36, "Masculino");
        pessoas[1]= new Pessoa("Débora", 30, "Feminino");

        livros[0] = new Livro("A Bússola de Ouro", "Philip Pullman", 416, pessoas[0]);
        livros[1] = new Livro("1984", "George Orwell", 328, pessoas[0]);
        livros[2] = new Livro("O Pequeno Príncipe", "Antoine de Saint-Exupéry", 96, pessoas[1]);
        

        livros[0].abrir();
        livros[0].folhear(100);
        livros[0].avancarPagina();
        System.out.println(livros[0].detalhes());
    }
}
