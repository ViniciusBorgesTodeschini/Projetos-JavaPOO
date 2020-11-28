package aula06;
public class ControleRemoto implements Controlador { //implements Nome = usado para fazer a subscrição
    //Atributos
    private int volume;
    private boolean ligando;
    private boolean tocando;
    //Métodos especiais

    public ControleRemoto() {
        this.volume = 50;
        this.ligando = false;
        this.tocando = false;
    }

    private int getVolume() {
        return volume;
    }

    private void setVolume(int volume) {
        this.volume = volume;
    }

    private boolean getLigando() {
        return ligando;
    }

    private void setLigando(boolean ligando) {
        this.ligando = ligando;
    }

    private boolean getTocando() {
        return tocando;
    }

    private void setTocando(boolean tocando) {
        this.tocando = tocando;
    }
    
    //Métodos abstratos 

    @Override
    public void ligar() {
        this.setLigando(true);
    }

    @Override
    public void desligar() {
        this.setLigando(false);
    }

    @Override
    public void abrirMenu() {
        System.out.println("------ M E N U ------");
        System.out.println("Está ligado? " + this.getLigando());
        System.out.println("Está tocando? " + this.getTocando());
        System.out.print("Volume: " + this.getVolume());
        for (int i=1; i <= this.getVolume(); i+=10){
            System.out.print("|");
        }
        System.out.println("");
    }
    
    @Override
    public void fecharMenu(){
        System.out.println("Fechando Menu...");
    }

    @Override
    public void maisVolume() {
        if ( this.getLigando()){
            this.setVolume(this.getVolume() + 5);
        } else {
            System.out.println("Impossível aumentar volume");
        }
    }

    @Override
    public void menosVolume() {
        if (this.getLigando()){
            this.setVolume(this.getVolume() - 5);
        } else {
            System.out.println("Impossível diminuir volume");
        }
    }

    @Override
    public void ligarMudo() {
        if (this.getLigando() && this.getVolume() > 0){
            this.setVolume(0);
        }
    }

    @Override
    public void desligarMudo() {
        if (this.getLigando() && this.getVolume() == 0 ){
            this.setVolume(50);
        }
    }

    @Override
    public void play() {
        if (this.getLigando() && !(this.getTocando())){
            this.setTocando(true);
        } else {
            System.out.println("Não consegui reproduzir");
        }
    }

    @Override
    public void pause() {
        if (this.getLigando() && this.getTocando()){
            this.setTocando(false);
        } else {
            System.out.println("Não consegui pausar");
        }
            
    }
    
}
