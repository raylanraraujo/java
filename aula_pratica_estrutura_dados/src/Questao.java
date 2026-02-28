public class Questao {
    private String enunciado;
    private String alternativa1;
    private String alternativa2;
    private String alternativa3;
    private String alternativa4;
    private int respostaCorreta;

    public Questao(String enunciado, String alternativa1, String alternativa2, String alternativa3, String alternativa4, int respostaCorreta){
        this.enunciado = enunciado;
        this.alternativa1 = alternativa1;
        this.alternativa2 = alternativa2;
        this.alternativa3 = alternativa3;
        this.alternativa4 = alternativa4;
        this.respostaCorreta = respostaCorreta;
    }

    public String mostrar(){
        return enunciado + "\n" +
        "1 - " + alternativa1 +
        "\n2 - " + alternativa2 +
        "\n3 - " + alternativa3 +
        "\n4 - " + alternativa4;
    }

    public Boolean estaCorreto(int resposta){
        return this.respostaCorreta == resposta;
    }
}
