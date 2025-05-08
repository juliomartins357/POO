package calc2;

import java.util.Scanner;

public class Menu {
    static Scanner sc = new Scanner(System.in);


    public static void main(String[] args) {
        int opcao = 0;
        System.out.println("Olá bem vindo  a calculadora;");
        System.out.println("Qual  forma geométrica voê gostaria de calcular? ");
        System.out.println("Opções  \n 1.Quadrado \n  2.Retângulo");
        opcao  = sc.nextInt();

        switch (opcao) {
            case 1: {
                System.out.println("Digite a cor do  quadrado");
                String cor = sc.next();
                System.out.println("Digite o  lado  do:");
                double lado = sc.nextDouble();

                Quadrado quadrado = new Quadrado(cor, lado);
                System.out.println("Area" + quadrado.calculaArea());
                System.out.println("Perimetro" + quadrado.calculaPerimetro());
                System.out.println("Volume" + quadrado.calculaVolume());
                break;
            }
        }
    }
}
