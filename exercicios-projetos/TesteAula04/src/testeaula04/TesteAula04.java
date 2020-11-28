
package testeaula04;

public class TesteAula04 {

    public static void main(String[] args) {
        Computador c1 = new Computador("AMD Ryzen 7 4700",8,500,"SSD"," RX 580 8 GB");
        c1.status();
        
        System.out.println("------------------------------");
        Computador c2 = new Computador ("Intel i7 10ª geração",8,500,"SSD","GeForce 1650 super 8 GB");
        c2.status();

    }
    
}
