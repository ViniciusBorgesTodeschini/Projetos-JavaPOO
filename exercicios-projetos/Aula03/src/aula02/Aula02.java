package aula02;
public class Aula02 {


    public static void main(String[] args) {
        Caneta c1 = new Caneta();
        c1.modelo = "BIC Cristal";
        c1.cor = "Azul";
        /*c1.ponta = 0.5f;  
        COMO A PONTA ESTÁ DEFINIDA COMO "PRIVADA" NÃO EXCUTA ESSA LINHA */
        c1.carga = 80; //ele permite mexer pois o objeto c1 está dentro da classe caneta
        c1.destampar ();
        c1.rabiscar();
        c1.status();

    }
    
}
