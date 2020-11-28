package aula05exerciciobanco;

public class Aula05ExercicioBanco {

    public static void main(String[] args) {
        Conta c1 = new Conta();
        c1.abrirConta("CC");
        c1.setdono("Jubileu");
        c1.setnumConta(18717);
        c1.depositar(300);
        c1.pagarMensal(0);
        
        c1.informacoes();

        
        Conta c2 = new Conta();
        c2.abrirConta("CP");
        c2.setdono("Creuza");
        c2.setnumConta(17518);
        c2.depositar(500);
        c2.sacar(100);
        c2.pagarMensal(0);
        
        c2.informacoes();
        
        
        Conta c3 = new Conta ();
        c3.abrirConta("CC");
        c3.setdono("Vini");
        c3.setnumConta(696969);
        c3.depositar(100);
        c3.pagarMensal(0);
        c3.sacar(89);
        
        c3.informacoes();
        
        System.out.println("Encerrando a Conta n° " + c3.getnumConta() + " de " + c3.getdono());
        c3.sacar(49f);
        c3.fecharConta();
        System.out.println("CONTA ENCERRADA");
        
        c3.informacoes();
    }
    
}
