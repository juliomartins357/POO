package Autocar;

import java.util.Scanner;

public class Menu {
    static Scanner sc =  new Scanner(System.in);
    public static void main(String[] args) {
        int quantidadeRodas;
        String chassi;
        String marca;
        String tipo;

        Veiculo veiculo = new Veiculo();

        System.out.println("Quantidade de Rodas");
        veiculo.setQuantidadeRodas(sc.nextInt());
        System.out.println("Chassi");
        veiculo.setChassi(sc.next());
        System.out.println("Marca");
        veiculo.setMarca(sc.next());
        System.out.println("Tipo");
        veiculo.setTipo(sc.next());

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





        System.out.println(veiculo.toString());
        System.out.println(veiculo2.toString());
        System.out.println(veiculo3.toString());
    }
}
