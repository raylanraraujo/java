public class Conta {
    public int numero;
    protected String tipo;
    private String dono;
    private float saldo;
    private boolean status;

    public Conta(int numero, String tipo, String dono){
        this.numero = numero;
        this.tipo = tipo;
        this.dono = dono;
        this.saldo = 0f;
        this.status = false;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getTipo(){
        return tipo;
    }

    public void setTipo(String tipo){
        this.tipo = tipo;
    }

    public String getDono() {
        return dono;
    }

    public void setDono(String dono) {
        this.dono = dono;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public void abrirConta(){
        setStatus(true);
    }

    public void depositar (float dinheiro){
       this.saldo += dinheiro;
    }

    public void sacar(float dinheiro){
        this.saldo -= dinheiro;
    }

    public void pagarMensalidade(float mensalidade){
        this.saldo -= mensalidade;
    }

    @Override
    public String toString() {
        return "Conta [ numero= " + numero + ", tipo= " + tipo + ", dono= " + dono + ", saldo= " + saldo + ", status= "
                + status + " ]";
    }

    

}
