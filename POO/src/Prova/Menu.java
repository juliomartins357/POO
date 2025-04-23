package Prova;

import java.util.Scanner;

public class Menu {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        String nome;
        float cpf;
        String email;

        Clinica clinica = new Clinica();
        System.out.println("Digite o o  seu  nome: ");
        clinica.setNome(sc.next());
        System.out.println("Digite qual é o seu CPF: ");
        clinica.setCpf(sc.nextFloat());
        System.out.println("Didite o  seu  email: ");
        clinica.setEmail(sc.next());

        Clinica clinica2 = new Clinica();
        System.out.println("Digite o o  seu  nome: ");
        clinica2.setNome(sc.next());
        System.out.println("Digite qual é o seu CPF: ");
        clinica2.setCpf(sc.nextFloat());
        System.out.println("Didite o  seu  email: ");
        clinica2.setEmail(sc.next());

        Clinica clinica3 = new Clinica();
        System.out.println("Digite o o  seu  nome: ");
        clinica3.setNome(sc.next());
        System.out.println("Digite qual é o seu CPF: ");
        clinica3.setCpf(sc.nextFloat());
        System.out.println("Didite o  seu  email: ");
        clinica3.setEmail(sc.next());

        Clinica clinica4 = new Clinica();
        System.out.println("Digite o o  seu  nome: ");
        clinica4.setNome(sc.next());
        System.out.println("Digite qual é o seu CPF: ");
        clinica4.setCpf(sc.nextFloat());
        System.out.println("Didite o  seu  email: ");
        clinica4.setEmail(sc.next());



        System.out.println(clinica.toString());
        System.out.println(clinica2.toString());
        System.out.println(clinica3.toString());
        System.out.println(clinica4.toString());
    }
}
