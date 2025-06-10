package polimorfismo;

import estimacao.Animal;

public class Passaro  extends Animal {
    private String corpenas;

    public Passaro(String nome, int idade, String corpenas){
        super(nome, idade);
        this.corpenas = corpenas;
    }

    public String getCorpenas() {
        return corpenas;
    }

    public void setCorpenas(String corpenas) {
        this.corpenas = corpenas;
    }

    @Override
    public void emitirsom() {
        System.out.println("Piu piu!");
    }

    @Override
    public void comer() {
        System.out.println("O pássaro está comendo sementes ");
    }

    @Override
    public void exibirinfo() {
        System.out.println();
    }
}
