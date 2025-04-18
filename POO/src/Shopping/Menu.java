package Shopping;

import java.util.Scanner;

public class Menu {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        String nome;
        double preco;

        Produto produto = new Produto();

        System.out.println("Digite qual o nome do produto: ");
        produto.setNome(sc.next());
        System.out.println("O preço do produto é");
        produto.setPreco(sc.nextDouble());

        Produto produto2 = new Produto();

        System.out.println("Digite qual o nome do produto: ");
        produto2.setNome(sc.next());
        System.out.println("O preço do produto é");
        produto2.setPreco(sc.nextDouble());

        Produto produto3 = new Produto();

        System.out.println("Digite qual o nome do produto: ");
        produto3.setNome(sc.next());
        System.out.println("O preço do produto é");
        produto3.setPreco(sc.nextDouble());


        System.out.println(produto.toString());
        System.out.println(produto2.toString());
        System.out.println(produto3.toString());
    }
}
