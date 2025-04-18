package Escola;

import java.util.Scanner;

public class Menu {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        String nome;
        int matricula;
        double notaFinal;

        Aluno aluno = new Aluno();
        System.out.println("Qual o nome do  aluno??");
        aluno.setNome(sc.next());
        System.out.println("Digite a matrícula do  aluno: ");
        aluno.setMatricula(sc.nextInt());
        System.out.println("A nota final  do aluno é");
        aluno.setNotaFinal(sc.nextDouble());

        Aluno aluno2 = new Aluno();
        System.out.println("Qual o nome do  aluno??");
        aluno2.setNome(sc.next());
        System.out.println("Digite a matrícula do  aluno: ");
        aluno2.setMatricula(sc.nextInt());
        System.out.println("A nota final  do aluno é");
        aluno2.setNotaFinal(sc.nextDouble());

        Aluno aluno3 = new Aluno();
        System.out.println("Qual o nome do  aluno??");
        aluno3.setNome(sc.next());
        System.out.println("Digite a matrícula do  aluno: ");
        aluno3.setMatricula(sc.nextInt());
        System.out.println("A nota final  do aluno é");
        aluno3.setNotaFinal(sc.nextDouble());

        Aluno aluno4 = new Aluno();
        System.out.println("Qual o nome do  aluno??");
        aluno4.setNome(sc.next());
        System.out.println("Digite a matrícula do  aluno: ");
        aluno4.setMatricula(sc.nextInt());
        System.out.println("A nota final  do aluno é");
        aluno4.setNotaFinal(sc.nextDouble());

        System.out.println(aluno.toString());
        System.out.println(aluno2.toString());
        System.out.println(aluno3.toString());
        System.out.println(aluno4.toString());





    }
}
