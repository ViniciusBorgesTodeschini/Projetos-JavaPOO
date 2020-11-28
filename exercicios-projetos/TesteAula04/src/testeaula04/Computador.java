
package testeaula04;

public class Computador {
    private String Processador;
    private int Memoria;
    private int Hd;
    private String Tipohd;
    private String Placavideo;
    
    public Computador (String p, int m, int h, String thd, String pv){
        this.setProcessador(p);
        this.setMemoria(m);
        this.setHd(h);
        this.setTipohd(thd);
        this.setPlacaVideo(pv);
    }
    
    public String getProcessador (){
        return this.Processador;
    }
    
    public void setProcessador (String p){
        this.Processador = p;
    }
    
    public int getMemoria (){
        return this.Memoria;
    }
    
    public void setMemoria (int m){
        this.Memoria = m;
    }
    
    public int getHd (){
        return this.Hd;
    }
    
    public void setHd (int h){
        this.Hd = h;
    }
    
    public String getTipohd (){
        return this.Tipohd;
    }
    
    public void setTipohd (String thd){
        this.Tipohd = thd;
    }
    
    public String getPlacavideo (){
        return this.Placavideo;
    }
    
    public void setPlacaVideo (String pv){
        this.Placavideo = pv;
    }
    
    public void status(){
        System.out.println("ESPECIFICAÇÕES DO COMPUTADOR: ");
        System.out.println("Processador: " + this.Processador);
        System.out.println("Mémoria: " + this.Memoria + " GB");
        System.out.println("Armazenamento: " + this.Hd + "GB de " + this.Tipohd);
        System.out.println("Placa de Vídeo: " + this.Placavideo);
    }
}
