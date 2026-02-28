import java.util.Scanner;

public class Prova {
    Aluno candidato;
    Questao q1, q2, q3, q4;

    private int r1, r2, r3, r4;
    private float nota;

    public Prova(Aluno candidato, Questao q1, Questao q2, Questao q3, Questao q4) {
        this.candidato = candidato;
        this.q1 = q1;
        this.q2 = q2;
        this.q3 = q3;
        this.q4 = q4;
        //a questao pede para que as respostas sejam inicializadas com 9999
        r1 = 9999;
        r2 = 9999;
        r3 = 9999;
        r4 = 9999;
        nota = 0;
    }
    
    public void implementarProva(){
        Scanner leitor = new Scanner(System.in);

        System.out.println(q1.mostrar());
        System.out.println("Selecione a resposta: ");
        r1 = leitor.nextInt();

        System.out.println(q2.mostrar());
        System.out.println("Selecione a resposta: ");
        r2 = leitor.nextInt();

        System.out.println(q3.mostrar());
        System.out.println("Selecione a resposta: ");
        r3 = leitor.nextInt();

        System.out.println(q4.mostrar());
        System.out.println("Selecione a resposta: ");
        r4 = leitor.nextInt();

        leitor.close();
    }

    public void corrigirProva(){
        nota = 0;
        if(q1.estaCorreto(r1)) nota+=2.5f;
        if(q2.estaCorreto(r2)) nota+=2.5f;
        if(q3.estaCorreto(r3)) nota+=2.5f;
        if(q4.estaCorreto(r4)) nota+=2.5f;
        exibirResultado();
    }

    public void exibirResultado(){
        System.out.printf("A prova do aluno %s", candidato.getNome());
        System.out.println("\n-----------------------------------------");
        System.out.printf("\nNota final: %f", nota);

        // if(q1.estaCorreto(r1)){
        //     System.out.println("1) OK");
        // } else {
        //     System.out.println("1) X");
        // }

        //  if(q2.estaCorreto(r2)){
        //     System.out.println("2) OK");
        // } else {
        //     System.out.println("2) X");
        // }

        //  if(q3.estaCorreto(r3)){
        //     System.out.println("3) OK");
        // } else {
        //     System.out.println("3) X");
        // }

        //  if(q1.estaCorreto(r4)){
        //     System.out.println("4) OK");
        // } else {
        //     System.out.println("4) X");
        // }

    }



}
