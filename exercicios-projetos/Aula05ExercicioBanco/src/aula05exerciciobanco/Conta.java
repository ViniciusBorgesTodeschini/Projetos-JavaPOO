package aula05exerciciobanco;


public class Conta {
    public int numConta;
    protected String tipo;
    private String dono;
    private float saldo;
    private boolean status;
    
    //Métodos Especiais
    public Conta() {
        this.status = false;
        this.saldo = 0;
}
    
    public int getnumConta (){
        return this.numConta;
    }
    public void setnumConta (int n){
        this.numConta = n;
    }
    
    public String gettipo (){
        return this.tipo;
    }
    public void settipo (String t){
        this.tipo = t;
    }
    
    public String getdono (){
        return this.dono;
    }
    public void setdono (String d){
        this.dono = d;
    }
    
    public float getsaldo(){
        return this.saldo;
    }
    public void setsaldo (float s){
        this.saldo = s;
    }
    
    public boolean getstatus(){
        return this.status;
    }
    public void setstatus (boolean aberta){
        this.status = aberta;
    }
    
    //Métodos Personalizados
    public void abrirConta(String t){
        this.settipo(t);
        this.setstatus(true);
        if (t == "CC"){
           this.setsaldo(50);
        } else if (t == "CP"){
                this.setsaldo(150);
            }    
    }
    
    public void fecharConta (){
        if (this.getsaldo() > 0){
            System.out.println("Conta não pode ser encerrada com dinheiro");
        } else if (this.getsaldo() < 0){
                System.out.println("Conta não pode ser encerrada com débito");
            } else {
                this.setstatus(false);
            }
    }
    public void depositar (float dep){
        if (this.getstatus() == true){
            this.setsaldo(this.getsaldo() + dep);
            // mesma coisa que this.setsaldo = saldo + v;
        } else {
            System.out.println("Impossível depositar em uma conta fechada!");
        }
    }
    public void sacar (float sac){
        if (this.getstatus() == true){
            if (this.getsaldo() >= sac ){
                this.setsaldo(this.getsaldo() - sac);
            } else {
                System.out.println("Saldo insuficiente para saque!");
            }
        } else {
            System.out.println("Impossível sacar de uma conta fechada!");
        }
    }
    public void pagarMensal (float v){
        if (this.gettipo() == "CC"){
            v = 12;            
        } else if ( this.gettipo() == "CP"){
                v = 20;
            }
        if (this.getstatus()== true){
            this.setsaldo(this.getsaldo() - v);
        } else {
            System.out.println("Impossível debitar com a conta fechada!");
        }    
    }
    
    public void informacoes(){
        System.out.println("Titular da conta: " + this.getdono());
        System.out.println("Número da conta: " + this.getnumConta()+ " " + this.gettipo());
        System.out.println("Saldo da conta: " + this.getsaldo());
        System.out.println("Está aberta? " + this.getstatus());
        System.out.println("---------------------------------------");
    }
}
