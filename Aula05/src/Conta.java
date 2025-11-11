public class Conta {
    public int numero;
    protected String tipo;
    private String dono;
    private float saldo;
    private boolean status;

    public Conta(){
        //this.numero = numero;
        //this.tipo = tipo;
        //this.dono = dono;
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

    public void abrirConta(String tipo){
        if (this.status == false){
            setStatus(true);
            setTipo(tipo);
            if ("CC".equals(tipo)){
                this.saldo = 50f;
            } else if("CP".equals(tipo)) {
                this.saldo = 150f;
            }   
        }
    }

    public void fecharConta(){
        if(status && this.saldo == 0){
            this.status = false;
            System.out.println("Conta fechada.");
        } else {
            System.out.println("Não é possível fechar a conta.");
        }
    }

    public void depositar (float dinheiro){
        if(status) {
            this.saldo += dinheiro;
            System.out.printf("Depósito de R$ %.2f realizado com sucesso.\n", dinheiro);
        } else{
            System.out.printf("Não é possível depositar R$ %.2f\nStatus Conta aberta: %b\n", dinheiro ,isStatus());
        }
    }

    public void sacar(float dinheiro){
        if(status && saldo >= dinheiro){
            this.saldo -= dinheiro;
            System.out.printf("Saque de R$ %.2f realizado com sucesso.\n",dinheiro);
        } else {
            System.out.println("Saldo insuficiente!");
        }
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
