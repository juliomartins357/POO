package Prova.cidade;

import java.util.Scanner;

public class menu {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        String nome;
        String idade;

        Pessoa pessoa = new Pessoa();

        System.out.println("Digite qual  seu nome: ");
        pessoa.setNome(sc.next());
        System.out.println("Digite qual a sua idade:");
        pessoa.setIdade(sc.next());

        Pessoa pessoa2 = new Pessoa();

        System.out.println("Digite qual  seu nome: ");
        pessoa2.setNome(sc.next());
        System.out.println("Digite qual a sua idade:");
        pessoa2.setIdade(sc.next());

        System.out.println(pessoa.toString());
        System.out.println(pessoa2.toString());
    }
}
