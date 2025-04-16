package biblioteca;

import java.util.Scanner;

public class Menu {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
      String titulo;
      String autor;
      String anoDepublicacao;

      Livraria livraria = new Livraria();
        System.out.println("Qal o  título do  livro  que vc gostaria de pesquisar?? ");
        livraria.setTitulo(sc.next());
        System.out.println("Qual o  título  do  livro?");
        livraria.setAutor(sc.next());
        System.out.println("Qual o Ano  de publicação do Livro?? ");
        livraria.setAnoDepublicacao(sc.next());


        System.out.println(livraria.toString());


    }

}
