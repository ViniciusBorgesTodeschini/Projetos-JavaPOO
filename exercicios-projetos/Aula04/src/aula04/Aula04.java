package aula04;

public class Aula04 {

    public static void main(String[] args) {
        Caneta c1 = new Caneta( "NIC", "Amarela",0.5f);
        
        //c1.setModelo("BIC Cristal"); utilizado antes do método construtor estar pronto
        /*c1.modelo = "Bic"; essa linha dará erro pois a visibilidade dos métodos está como "private",
        para proteger os dados e incentivar a utilizar os métodos acessores.*/
        
        //c1.setPonta(0.5f); utilizado antes do método construtor estar pronto
        /*c1.ponta = 0.5f; essa linha dará erro pois a visibilidade dos métodos está como "private",
        para proteger os dados e incentivar a utilizar os métodos acessores.*/
                
        c1.status();
        // ou pode utilizar: System.out.println("Tenho uma caneta: " + c1.getModelo() + " de ponta " + c1.getPonta());
    }
    
}
