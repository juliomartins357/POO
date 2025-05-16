package biblioteca;

import java.util.Scanner;

public class Menu {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
      String titulo;
      String autor;
      int anoDepublicacao;





        System.out.println("Qual o  título do  livro  que vc gostaria de pesquisar?? ");
       titulo = sc.nextLine();
        System.out.println("Qual o  autor  do  livro?");
        autor = sc.nextLine();
        System.out.println("Qual o Ano  de publicação do Livro?? ");
        anoDepublicacao = sc.nextInt();

     if(anoDepublicacao <= 1900){
       System.out.println("Erro!!!!");
     }else{
       Livraria livraria1 = new Livraria(titulo,autor,anoDepublicacao);
       livraria1.observacoes();
     }


      System.out.println("Qual o  título do  livro  que vc gostaria de pesquisar?? ");
      titulo = sc.next();
      System.out.println("Qual o  autor  do  livro?");
      autor = sc.next();
      System.out.println("Qual o Ano  de publicação do Livro?? ");
      anoDepublicacao = sc.nextInt();

      if(anoDepublicacao <= 1900){
        System.out.println("Erro!!!!");
      }else{
        Livraria livraria2 = new Livraria(titulo,autor,anoDepublicacao);
        livraria2.observacoes();
      }

      System.out.println("Qual o  título do  livro  que vc gostaria de pesquisar?? ");
      titulo = sc.next();
      System.out.println("Qual o  autor  do  livro?");
      autor = sc.next();
      System.out.println("Qual o Ano  de publicação do Livro?? ");
      anoDepublicacao = sc.nextInt();

      if(anoDepublicacao <= 1900){
        System.out.println("Erro!!!!");
      }else{
        Livraria livraria3 = new Livraria(titulo,autor,anoDepublicacao);
        livraria3.observacoes();
      }



    }

}
