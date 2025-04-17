package biblioteca;

import java.util.Scanner;

public class Menu {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
      String titulo;
      String autor;
      String anoDepublicacao;

        Livraria livraria = new Livraria();
        System.out.println("Qual o  título do  livro  que vc gostaria de pesquisar?? ");
        livraria.setTitulo(sc.next());
        System.out.println("Qual o  título  do  livro?");
        livraria.setAutor(sc.next());
        System.out.println("Qual o Ano  de publicação do Livro?? ");
        livraria.setAnoDepublicacao(sc.next());

      Livraria livraria2 = new Livraria();
        System.out.println("Qual o  título do  livro  que vc gostaria de pesquisar?? ");
        livraria2.setTitulo(sc.next());
        System.out.println("Qual o  título  do  livro?");
        livraria2.setAutor(sc.next());
        System.out.println("Qual o Ano  de publicação do Livro?? ");
        livraria2.setAnoDepublicacao(sc.next());

        Livraria livraria3 = new Livraria();
        System.out.println("Qual o  título do  livro  que vc gostaria de pesquisar?? ");
        livraria3.setTitulo(sc.next());
        System.out.println("Qual o  título  do  livro?");
        livraria3.setAutor(sc.next());
        System.out.println("Qual o Ano  de publicação do Livro?? ");
        livraria3.setAnoDepublicacao(sc.next());


        System.out.println(livraria.toString());
        System.out.println(livraria2.toString());
        System.out.println(livraria3.toString());


    }

}
