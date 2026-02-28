public class App {
    public static void main(String[] args) throws Exception {
        Questao q1 = new Questao("Qual o nome do caçador de recompensas que usa uma armadura Mandaloriana em Star Wars?", "Boba Fett", "Jango Fett", "Din Djarin", "Cobb Vanth", 3);
        Questao q2 = new Questao("Em The Witcher, qual é o apelido de Geralt de Rívia?", "Lobo Branco", "Corvo Negro", "Gato de Prata", "Urso de Ferro", 1);
        Questao q3 = new Questao("Qual o nome da inteligência artificial que controla a nave em 2001: Uma Odisseia no Espaço?", "HAL 9000", "JARVIS", "SKYNET", "CORTANA", 1);
        Questao q4 = new Questao("Na série The Boys, qual o nome real do Capitão Pátria (Homelander)?", "John", "Billy", "Stan", "Ryan", 1);

        Aluno aluno01 = new Aluno("Jyraya", 12345);
        Prova p = new Prova(aluno01, q1, q2, q3, q4);

        p.implementarProva();
        p.corrigirProva();
    }
}
