public class App {
    public static void main(String[] args) throws Exception {
        
        //criando um vetor e inserindo valores nele
        int n[] = new int[4];
        n[0] = 10;
        n[1] = 11;
        n[2] = 12;
        n[3] = 13;

        //pode ser feito tudo de uma forma só
        int m[] = {20, 21, 22, 23};

        System.out.printf("\nTotal de casas de n: %d. Sendo:\n", n.length);

        for (int i = 0; i < n.length ; i++){
            System.out.printf("\t\t\t\tNa posiçao [%d] temos: %d\n", i, n[i]);
        }

        //exemplo dos meses do ano
        String mes[] = {"JAN","FEV","MAR","ABR","MAI","JUN","JUL","AGO","SET","OUT","NOV","DEZ"};
        int dias[] = {31, 28, 31,30,31, 30, 31, 31, 30, 31, 30, 31};

        for(int i = 0; i < mes.length; i++){
            System.out.printf("O mês %s tem %d dias.\n", mes[i], dias[i]);
        }
    }
}
