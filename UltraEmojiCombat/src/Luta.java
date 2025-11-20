import java.util.Random;

public class Luta {
    private Lutador desafiado;
    private Lutador desafiante;
    private int rounds;
    private boolean aprovada;

    // Métodos da classe
    public void marcarLuta(Lutador l1, Lutador l2){
      if(l1.getCategoria().equals(l2.getCategoria()) && l1 != l2){
        this.setAprovada(true);
        this.setDesafiado(l1);
        this.setDesafiante(l2);
      } else {
        this.setAprovada(false);
        this.setDesafiado(null);
        this.setDesafiante(null);
      }
    }

    public void lutar(){
        if(this.aprovada){
            this.desafiado.apresentar();
            this.desafiante.apresentar();
            int vencedor = new Random().nextInt(3); //Gera um número aleatório 0 , 1 ou 2

            switch (vencedor) {
                case 0: //caso de empate
                    System.out.println("Luta empatada");
                    this.desafiado.empatarLuta();
                    this.desafiante.empatarLuta();
                    break;
                case 1: // caso o desafiado ganhe a luta
                    System.out.println(this.desafiado.getNome() + " ganhou a luta.");
                    this.desafiado.ganharLuta();
                    this.desafiante.perderLuta();
                    break;
                case 2: // caso o desafiante ganhe a letra
                    System.out.println(this.desafiante.getNome() + " ganhou a luta.");
                    this.desafiado.perderLuta();
                    this.desafiante.ganharLuta();
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