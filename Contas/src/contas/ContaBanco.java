package contas;

public class ContaBanco {
    public int numConta;
    private boolean status;
    private float saldo;
    private String dono;
    protected String tipo;

    public ContaBanco(){
        this.setSaldo(0);
        this.setStatus(false);
    }

    public void estadoAtual(){
        System.out.println("____________________");
        System.out.println("Conta: " + this.getNumConta());
        System.out.println("Tipo: " + this.getTipo());
        System.out.println("Dono: " + this.getDono());
        System.out.println("Saldo: " + this.getSaldo());
        System.out.println("Status: " + this.getStatus());
        System.out.println("____________________");
    }

    public void abrirConta(){
        
        this.setTipo(tipo);
        this.setStatus(true);
        if (tipo == "CC"){
            this.setSaldo(50);
        }else if ( tipo == "CP"){
            this.setSaldo(150);

        }
        System.out.println("Conta aberta com sucesso:");

    }

    public void fecharConta(){
        if(this.getSaldo() > 0){
            System.out.println("Conta com dinheiro, impossivel fechar:");
        
        }else if(this.getSaldo() < 0){
            System.out.println("Conta com debito, impossivel fechar:");
       
        }else{
            this.setStatus(false);
            System.out.println("Conta fechada com sucesso:");
        }
        
    }

    public void depositar(float v){
        if(this.getStatus()){
            this.setSaldo(this.getSaldo() + v);
            System.out.println("Deposito realizado com  sucesso na conta de " + this.getDono());
        
        }else{
            System.out.println("Impossivel depositar conta fechada:");
        }
        
    }   

    public void sacar(float v){
        if(this.getStatus()){
           
            if(this.getSaldo() >= v){
                this.setSaldo(this.getSaldo() - v);
                System.out.println("Saque realizado com sucesso: " + this.getDono());
            
            }else{
                System.out.println("Saldo insuficiente para saque:");
            }

        }else{
            System.out.println("Impossivel sacar, conta sem saldo");
        }
    }

    public void pagarMensal(){
        int v = 0;
        if(this.getTipo() == "CC"){
            v = 12;
        }else if(this.getTipo() == "CP"){
            v = 20;
        
        }if(this.getStatus()){
            this.setSaldo(this.getSaldo() - v);
            System.out.println("Mensalidade paga: " + this.getDono());
        }else{
            System.out.println("Impossivel pagar, conta fechada:");
        }
    }

    public int getNumConta() {
        return numConta;
    }

    public void setNumConta(int n) {
        this.numConta = n;
    }

    public boolean getStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public String getDono() {
        return dono;
    }

    public void setDono(String dono) {
        this.dono = dono;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    
    
}
