package aula09;
public class Aula09 {
    public static void main(String[] args) {
        Pessoa p[] = new Pessoa [3];
        Livro l[] = new Livro [3];
        
        p[0] = new Pessoa ("Vinicius", 24, "masculino");
        p[1] = new Pessoa ("Debora",22,"Feminino");
        p[2] = new Pessoa ("Mae",53,"Feminino");
        
        l[0] = new Livro ("Biblia", "João",1001,p[0]);
        l[1] = new Livro ("50 tons de cinza","Zé",150,p[1]);
        l[2] = new Livro ("Dicionario", "Oxford", 800, p[2]);
        
        l[0].abrir();
        l[0].avancarPag();
        l[0].detalhes();
               

    }
    
}
