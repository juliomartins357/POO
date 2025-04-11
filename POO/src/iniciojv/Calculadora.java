package iniciojv;

import java.util.Scanner;


public class Calculadora {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        double num1, num2;
        int tipoCalculo;
        System.out.println("bem vindo ao programa calculadora! ");
        System.out.println("escreva o primeiro valor:");
        num1 = sc.nextDouble();
        System.out.println("escreva o segudo valor:");
        num2 = sc.nextDouble();

        tipoCalculo = opcaoCalculo();
        if (tipoCalculo == 1) {
            System.out.println("O resultdo é:" + (num1 + num2));
        } else if (tipoCalculo == 2) {
            System.out.println("O resultdo é:"  + (num1 - num2));
        } else if (tipoCalculo == 3) {
            System.out.println("O resultdo é:"  + (num1 * num2));
        } else if (tipoCalculo == 4) {
            System.out.println("O resultdo é:"  + (num1 / num2));
        } else {
            System.out.println("valor incorreto");
        }
    }

        public static int opcaoCalculo () {
            System.out.println("opcões de calculo:");
            System.out.println("1 -adicao");
            System.out.println("2 - subtracao");
            System.out.println("3 - multiplicacao");
            System.out.println("5 - divisao");

            int tipoCalculo = sc.nextInt();
            return tipoCalculo;
        }
    }