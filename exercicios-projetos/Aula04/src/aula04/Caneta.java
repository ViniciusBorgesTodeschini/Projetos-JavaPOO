
package aula04;


public class Caneta {
    private String modelo;
    private float ponta;
    private boolean  tampada;
    private String cor;
    
    public Caneta (String m, String c, float p){ //o método construtor tem o mesmo nome da classe.
        this.setModelo(m);
        this.setCor(c);
        this.setPonta(p);
        this.tampar();
        
    }
    
    public String getModelo(){
        return this.modelo;
    }
    public void setModelo (String m){
        this.modelo = m;
    }
    public float getPonta (){
        return this.ponta;
    }
    public void setPonta (float p){
        this.ponta = p;
    }
    
    public String getCor (){
        return this.cor;
    }
    
    public void setCor (String c){
        this.cor = c;
    }
    
    public void tampar (){
        this.tampada = true;
    }
    
    public void destampar (){
        this.tampada = false;
    }
    
    public void status (){
        System.out.println("Informações da Caneta:");
        System.out.println("Modelo: " + this.getModelo()); //para utilizar os métodos getters
        //System.out.println("Modelo: " + this.modelo); forma que mexe diretamente no atributo
        System.out.println("Ponta: " + this.getPonta()); //para utilizar os métodos getters
        //System.out.println("Ponta: " + this.ponta); forma que mexe diretamente no atributo
        System.out.println("Cor: " + this.cor);
        System.out.println("Tampada: " + this.tampada);
    }
}
