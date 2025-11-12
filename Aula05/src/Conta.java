public class Conta {
    public int numero;
    protected String tipo;
    private String dono;
    private float saldo;
    private boolean status;

    public void estadoAtual() {
        System.out.println("----------------------------------------");
        System.out.println("Conta: " + this.getNumero());
        System.out.println("Tipo: " + this.getTipo());
        System.out.println("Dono: " + this.getDono());
        System.out.println("Saldo: "+ this.getSaldo());
        System.out.println("Status: " + this.isStatus());
    }

    public Conta(){
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
        if (!this.isStatus()){ //this.isStatus() == false
            this.setStatus(true);
            this.setTipo(tipo);
            if ("CC".equals(tipo)){
                this.saldo = 50f; // posso declarar assim de maneira direta ou usando o método set
            } else if("CP".equals(tipo)) {
                this.setSaldo(150);
            } 
            System.out.println("Conta aberta com sucesso!");  
        }
    }

    public void fecharConta(){
        if(this.isStatus() && this.saldo == 0){
            this.setStatus(false);
            System.out.println("Conta fechada.");
        } else {
            System.out.println("Não é possível fechar a conta.");
        }
    }

    public void depositar (float dinheiro){
        if(this.isStatus()) {
            //this.saldo += dinheiro;
            this.setSaldo(this.getSaldo() + dinheiro); //usando os métodos especiais
            System.out.printf("Depósito de R$ %.2f realizado com sucesso.\n", dinheiro);
        } else{
            System.out.printf("Não é possível depositar R$ %.2f\nStatus Conta aberta: %b\n", dinheiro ,isStatus());
        }
    }

    public void sacar(float dinheiro){
        if(isStatus()){
            if(this.getSaldo() >= dinheiro){
                //this.saldo -= dinheiro;
                this.setSaldo(this.getSaldo() - dinheiro);
                System.out.printf("Saque de R$ %.2f realizado com sucesso.\n",dinheiro);

            } else {
                System.out.println("Saldo insuficiente!");
            }
        } else {
            System.out.println("Impossível sacar de conta fechada.");
        }
    }

    public void pagarMensalidade(){
        float mensalidade =0f; //inicializa a mensalidade zerada pois caso 

        if ("CC".equals(this.getTipo())){
            mensalidade = 12f;
        } else if ("CP".equals(this.getTipo())){
            mensalidade = 20f;
        }
        
        if(this.isStatus()){
            this.setSaldo(this.getSaldo() - mensalidade);
        }
    }

    @Override
    public String toString() {
        return "Conta [ numero= " + numero + ", tipo= " + tipo + ", dono= " + dono + ", saldo= " + saldo + ", status= "
                + status + " ]";
    }

    

}
