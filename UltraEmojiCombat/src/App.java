public class App {
    public static void main(String[] args) throws Exception {
        Lutador lutador[] = new Lutador[6]; // cria um vetor do tipo Lutador com 6 "espaços"


        
        lutador[0] = new Lutador("Pretty Boy", "França", 31, 1.75f, 68.9f, 11, 2,1);
        
        lutador[1] = new Lutador("Putscript","Brasil", 29, 1.68f, 57.8f, 14, 2, 3);

        lutador[2] = new Lutador("Snapshadow","EUA", 35, 1.65f, 80.9f, 12, 2,1);

        lutador[3] = new Lutador("Dead Code", "Austrália", 28, 1.93f, 81.6f, 13, 0, 2);

        lutador[4] = new Lutador("Ufocobol","Brasil", 37, 1.70f, 119.3f, 5, 4, 3);

        lutador[5] = new Lutador("Nerdaard", "EUA", 30, 1.81f, 105.7f, 12, 2, 4);

        lutador[1].status();
        lutador[2].apresentar();
    }
}
/*
 * Para criar 6 lutadores eu poderia criar uma variável para cada lutador, mas isso daria muito trabalho. 
 * Existem as variáveis compostas. Objetos são como se fossem variáveis só que eles são instancias de uma classe.
 * Dessa forma, cria-se um vetor com 6 indices [indo de zero até 5] que conterá os 6 lutadores. Emc cada índice será armazenado um objeto lutador que tem suas informações passadas para o construtor.
 * Foi iniciado com zero porque em Java os índices são iniciados em zero. 
 * Depois sao atribuidos a cada índice do vetor um novo lutador e passados as suas informacoes como parâmetros do objeto
 *  O construtor vai fazer a chamada e eu vou definir todos os atributos do objeto em uma única linha. Dessa forma eu declaro todo os lutadores
 * 
 * Em POO, agregação é quando um objeto tem um objeto. 
 * 
 * 
 *   
*/