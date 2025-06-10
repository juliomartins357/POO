package biblioteca;

public class Livraria {
    private String titulo;
    private String autor;
    private int anoDepublicacao;

    public Livraria(String titulo, String autor, int anoDepublicacao){
        this.titulo = titulo;
        this.autor = autor;
        this.anoDepublicacao = anoDepublicacao;
    }

    public Livraria(){

    }

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

    public int getAnoDepublicacao() {
        return anoDepublicacao;
    }

    public void setAnoDepublicacao(int anoDepublicacao) {
        this.anoDepublicacao = anoDepublicacao;
    }

   public void observacoes(){
       System.out.println("Título: " + titulo);
       System.out.println("Autor: " + autor);
       System.out.println("Ano de publicação: " + anoDepublicacao);
   }



}
