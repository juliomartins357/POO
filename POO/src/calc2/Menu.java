package calc2;

import java.util.Scanner;

public class Menu {
    static Scanner sc = new Scanner(System.in);


    public static void main(String[] args) {


        int opcao;
        do {
            System.out.println("Olá bem vindo  a calculadora;");
            System.out.println("Qual  forma geométrica voê gostaria de calcular? ");
            System.out.println("Opções \n 0.Sair  \n 1.Quadrado \n  2.Retângulo");

            opcao = sc.nextInt();

            switch (opcao) {
                case 0: {
                    System.out.println("Obrigdo  por utilizar o  nosso  sistema volte sempre!!!!!");
                    break;
                }
                case 1: {
                    System.out.println("Digite a cor do quadrado");
                    String cor = sc.next();
                    System.out.println("digite o  lado  do quadrado");
                    double lado = sc.nextDouble();

                    Quadrado quadrado = new Quadrado(cor, lado);

                    int opcao2;

                    do {
                        opcao2 = menuCalculo();

                        if (opcao2 < 0 || opcao2 > 3) {
                            System.out.println("Opção invalida tente novamente!!!!!!!");
                        }
                        switch (opcao2) {
                            case 1: {
                                System.out.println("Perimetro" + quadrado.calculaPerimetro());
                                break;

                            }
                            case 2: {
                                System.out.println("Area: " + quadrado.calculaArea());
                                break;
                            }
                            case 3: {
                                System.out.println("Volume:" + quadrado.calculaVolume());
                                break;
                            }

                        }

                    }while (opcao2 != 0) ;

                        break;

                    }
                }

            } while (opcao != 0) ;
        }
        static public int menuCalculo () {
            System.out.println("Qual calculo deseja fazer");
            System.out.println("Opções: \n " + "0.Voltar: \n" + "1.Perimetro: \n" + "2.Area: \n" + "3.Volume \n");
            return sc.nextInt();

        }
    }

