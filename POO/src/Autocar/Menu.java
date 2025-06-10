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

        Veiculo veiculo2 = new Veiculo();

        System.out.println("Quantidade de Rodas");
        veiculo2.setQuantidadeRodas(sc.nextInt());
        System.out.println("Chassi");
        veiculo2.setChassi(sc.next());
        System.out.println("Marca");
        veiculo2.setMarca(sc.next());
        System.out.println("Tipo");
        veiculo2.setTipo(sc.next());

        Veiculo veiculo3 = new Veiculo();

        System.out.println("Quantidade de Rodas");
        veiculo3.setQuantidadeRodas(sc.nextInt());
        System.out.println("Chassi");
        veiculo3.setChassi(sc.next());
        System.out.println("Marca");
        veiculo3.setMarca(sc.next());
        System.out.println("Tipo");
        veiculo3.setTipo(sc.next());





<<<<<<< HEAD
        System.out.println(veiculo.toString());
        System.out.println(veiculo2.toString());
        System.out.println(veiculo3.toString());
=======
>>>>>>> 07e1633239a083bad1da9be04be05325c124224c
    }
}
