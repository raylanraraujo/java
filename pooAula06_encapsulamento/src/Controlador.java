public interface Controlador {
    //Métodos abstratos
    public abstract void ligar();
    public abstract void desligar();
    public abstract void abrirMenu();
    public abstract void fecharMenu();
    public abstract void maisVolume();
    public abstract void menosVolume();
    public abstract void ligarMudo();
    public abstract void desligarMudo();
    public abstract void play();
    public abstract void pause();
}
/*
 * Para criar um controla voce vai em Arquivo > Novo arquivo > Novo Arquivo Java > Interface;
 * 
 * Na interface você tem uma lista de métodos.
 * 
 * Como é um método abstrato, ele nao tem bloco de código. Para declarar especificamente que é um método abstrato coolocamos 'abstract'.
 * 
 * Por conta dos métodos desse exemplo nao retornarem nada foi colocado 'void' na sua declaração. Caso retornasse, no lugar dele seria colocado o 'tipo' de retorno e dentro dos parenteses algum parametro que ele necessite.
 * 
 * 
 */

