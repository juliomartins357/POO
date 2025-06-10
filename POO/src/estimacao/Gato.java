package estimacao;

public class Gato extends Animal {
    private String corpelo;

    public Gato(String nome, int idade, String corpelo){
        super(nome, idade);
        this.corpelo = corpelo;
    }

    public String getCorpelo() {
        return corpelo;
    }

    public void setCorpelo(String corpelo) {
        this.corpelo = corpelo;
    }

    @Override
    public void emitirsom() {
        System.out.println("Miau");
    }

    @Override
    public void comer() {
        System.out.println("O gato está comendo peixe");
    }

    @Override
    public void exibirinfo() {
        System.out.println();
    }
}
