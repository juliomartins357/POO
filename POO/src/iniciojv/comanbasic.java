package iniciojv;

import java.util.Scanner;

public class comanbasic {

    static Scanner sc =  new Scanner(System.in); //prompt ele recebe  mensagem
    public static void main(String[] args) {
        //Variaveis de tipos primitivos
        boolean trueorfalse =  true;
        int numeroReais = 0;
        double decimais = 0.2; // 10000.20000 a -10000000.40
        char letra = 'A';

        // variavel  tipo  objeto
        String texto =  "texto";
        Integer numeroreais =  2; // inteiro do  tipo objeto
        double decimais2 = 0.2; // decimal do  tipo objeto

        String nome = null; //null==
        String sexo = "";
        System.out.println("Qual  seu  nome??"); // escreva no  terminal exmplo  so  digite
        nome = sc.nextLine(); //leia -escreva na variavel nome

        System.out.println("o  seu  nome é " + nome);
    }
}
