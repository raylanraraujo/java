import java.util.Random;

public class Luta {
    private Lutador desafiado;
    private Lutador desafiante;
    private int rounds;
    private boolean aprovada;

    // Métodos da classe
    public void marcarLuta(Lutador l1, Lutador l2){
      if(l1.getCategoria() == l2.getCategoria() && l1 != l2){
        setAprovada(true);
        setDesafiado(l1);
        setDesafiante(l2);
      } else {
        setAprovada(false);
        setDesafiado(null);
        setDesafiante(null);
      }
    }

    public void lutar(){
        if(this.aprovada){
            desafiado.apresentar();
            desafiante.apresentar();
            int vencedor = new Random().nextInt(3);

            switch (vencedor) {
                case 0:
                    System.out.println("Luta empatada");
                    desafiado.empatarLuta();
                    desafiante.empatarLuta();
                    break;
                case 1:
                    System.out.println(desafiado.getNome() + " ganhou a luta.");
                    desafiado.ganharLuta();
                    desafiante.perderLuta();
                    break;
                case 2:
                    System.out.println(desafiante.getNome() + " ganhou a luta.");
                    desafiado.perderLuta();
                    desafiante.ganharLuta();
                    break;
                default:
                    break;
            }
        } else{
            System.out.println("Luta não pode acontecer.");
        }
    }

    //Métodos especiais
    public Lutador getDesafiado(){
        return this.desafiado;
    }

    public void setDesafiado(Lutador lutador){
        this.desafiado = lutador;
    }

    public Lutador getDesafiante(){
        return this.desafiante;
    }

    public void setDesafiante(Lutador lutador){
        this.desafiante = lutador;
    }

    public int getRounds(){
        return this.rounds;
    }

    public void setRounds(int rounds){
        this.rounds = rounds;
    }

    public boolean getAprovada(){
        return this.aprovada;
    }

    public void setAprovada(boolean aprovada){
        this.aprovada = aprovada;
    }

}

/**
 * Em vez de colocar um tipo primitivo para declarar "desafiante" e "desafiado" eu posso colocar um tipo abstrato. Nesse caso eu especifico que é do tipo Lutador que é referente à classe criada. Fazendo com que ambos sejam uma instância (um objeto) da classe Lutador. Isso é considerado tipo abstrato de dados. 
 * Sendo assim eu vou ter uma instancia da classe Lutador que sera o desafiado. Dessa forma é criado uma relação entre esse tipo abstrato e uma instancia de uma determinada classe. 
 */