package aula09;
public class Livro implements Publicacao {
    private String titulo, autor;
    private int totParginas,pagAtual;
    private boolean aberto;
    private Pessoa leitor;
    
    //Métodos especiais

    public Livro(String titulo, String autor, int totParginas,Pessoa leitor) {
        this.aberto = false;
        this.titulo = titulo;
        this.autor = autor;
        this.totParginas = totParginas;
        this.pagAtual = 0;
        this.setLeitor(leitor);
    }
    public void detalhes (){
        if (this.getAberto()){
            System.out.println("Título do livro: " + this.getTitulo());        
            System.out.println("Autor do livro: " + this.getAutor());
            System.out.println("Total de paginas: " + this.totParginas);
            System.out.println("O leitor " + leitor.getNome() + " está na pagina " + this.getPagAtual() + ".");
        } else {
            System.out.println("O livro está fechado");
        }
    }   
    
    //Métodos acessorios

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getTotParginas() {
        return totParginas;
    }

    public void setTotParginas(int totParginas) {
        this.totParginas = totParginas;
    }

    public int getPagAtual() {
        return pagAtual;
    }

    public void setPagAtual(int pagAtual) {
        this.pagAtual = pagAtual;
    }

    public boolean getAberto() {
        return aberto;
    }

    public void setAberto(boolean aberto) {
        this.aberto = aberto;
    }

    public Pessoa getLeitor() {
        return leitor;
    }

    public void setLeitor(Pessoa leitor) {
        this.leitor = leitor;
    }
    //Métodos acessórios interface
    
    @Override
    public void abrir() {
        this.setAberto(true);
    }

    @Override
    public void fechar() {
        this.setAberto(false);
    }

    @Override
    public void folhear(int p) {
        if (p> this.pagAtual){
            this.pagAtual = 0;
        } else {
        this.pagAtual = p;
        }
    }

    @Override
    public void avancarPag() {
        this.setPagAtual(this.getPagAtual() + 1);
    }

    @Override
    public void voltarPag() {
        this.setPagAtual(this.getPagAtual() - 1);
    }
    
    
}
