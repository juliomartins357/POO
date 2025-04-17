package biblioteca;

public class Livraria {
    private String titulo;
    private String autor;
    private String anoDepublicacao;

    public Livraria(String titulo, String autor, String anoDepublicacao){
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

    public String getAnoDepublicacao() {
        return anoDepublicacao;
    }

    public void setAnoDepublicacao(String anoDepublicacao) {
        this.anoDepublicacao = anoDepublicacao;
    }

    @Override
    public String toString() {
        return "livraria{" +
                "\ntitulo'" + titulo + "" +
                ", \nautor'" + autor + " " +
                ", \nanoDepublicacao'" + anoDepublicacao;



    }
}
