import java.util.Date; //

public class HoraDoSistema {
    public static void main(String[] args) {
        Date relogio = new Date(); //a palavra new faz a criação de novo objeto.
        System.out.println("A hora do sistema é"); 
        System.out.println(relogio.toString());     
    }
}
