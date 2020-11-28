package aula13;
public class Aula13 {
    public static void main(String[] args) {
        //Programa Principal
        Mamifero x = new Mamifero ();
        Lobo l = new Lobo ();
        Cachorro c = new Cachorro ();
        
        x.emitirSom();
        l.emitirSom();
        
        System.out.println("-----------------------------------");
        c.emitirSom();
        c.reagir("Olá");
        c.reagir("Vai apanhar");
        c.reagir(11, 45);
        c.reagir(19, 00);
        c.reagir(true);
        c.reagir(false);
        c.reagir(2, 12.5f);
        c.reagir(17, 4.5f);
    }
    
}
