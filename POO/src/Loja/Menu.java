package Loja;

import java.util.Scanner;

public class Menu {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        String nomeProduto;
        float preco;
        int quantidadeEstoque;

       Estoque estoque   = new Estoque();
        System.out.println("Digite o  nome do  produto: ");
        estoque.setNomeProduto(sc.next());
        System.out.println("Qual o  preço  do produto");
        estoque.setPreco(sc.nextFloat());
        System.out.println("A quantidade no  estoque é:");
        estoque.setQuantidadeEstoque(sc.nextInt());


        Estoque estoque2   = new Estoque();
        System.out.println("Digite o  nome do  produto: ");
        estoque2.setNomeProduto(sc.next());
        System.out.println("Qual o  preço  do produto");
        estoque2.setPreco(sc.nextFloat());
        System.out.println("A quantidade no  estoque é:");
        estoque2.setQuantidadeEstoque(sc.nextInt());

        System.out.println(estoque.toString());
        System.out.println(estoque2.toString());

    }
}
