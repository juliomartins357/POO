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


        System.out.println(clinica.toString());
    }
}
