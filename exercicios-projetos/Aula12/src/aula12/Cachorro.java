package aula12;
public class Cachorro extends Mamifero {
    public void abanarRabo(){
        System.out.println("Abanando o rabo");
    }
    
    @Override
    public void emitirSom(){
        System.out.println("Au! Au! Au!");
    }
    
}
