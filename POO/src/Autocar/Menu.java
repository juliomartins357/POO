package Autocar;

import java.util.Scanner;

public class Menu {
    static Scanner sc =  new Scanner(System.in);
    public static void main(String[] args) {
        String modelodoveiculo;
        double quilometragem;
        String placa;

        System.out.println("Digite qual  o  modelo do veículo:");
        modelodoveiculo = sc.nextLine();
        sc.nextLine();
        System.out.println("Digite a quilometragem do  veiculo:");
        quilometragem = sc.nextDouble();
        System.out.println("Digite os números e letras da placa:");
        placa = sc.next();

        if (quilometragem < 0){
            System.out.println("A quilometragem tem que ser maior que 0");
        }else {
            Veiculo veiculo1 = new Veiculo(modelodoveiculo,quilometragem,placa);
            veiculo1.observacoes();
        }
        sc.nextLine();

        System.out.println("Digite qual  o  modelo do veículo:");
        modelodoveiculo = sc.nextLine();
        System.out.println("Digite a quilometragem do  veiculo:");
        quilometragem = sc.nextDouble();
        System.out.println("Digite os números e letras da placa:");
        placa = sc.next();

        if (quilometragem < 0){
            System.out.println("A quilometragem tem que ser maior que 0");
        }else {
            Veiculo veiculo2 = new Veiculo(modelodoveiculo,quilometragem,placa);
            veiculo2.observacoes();
        }



    }
}
