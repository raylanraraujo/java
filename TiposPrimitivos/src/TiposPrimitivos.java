public class TiposPrimitivos {
    public static void main(String[] args) {
        String nome = "Raylan";
        float nota = 9.5f; //float nota = (float) 8.5;
        System.out.print("A nota é " + nota);
        System.out.println("A nota é " + nota);
        System.out.printf("A nota de %s é %.2f.\n", nome, nota); 
        System.out.format("A nota de %s é %.2f.\n", nome, nota);
    }
    
}
