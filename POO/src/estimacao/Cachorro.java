package estimacao;

public class Cachorro  extends Animal{
    private String raca;

    public Cachorro(String nome, int idade, String raca){
        super(nome, idade);
        this.raca = raca;
    }

    public String getRaca() {
        return raca;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }



    @Override
    public void comer() {
        System.out.println("Au au!");
    }

    @Override
    public void emitirsom() {
        System.out.println("O cachorro está comendo ração");
    }

    @Override
    public void exibirinfo() {
        System.out.println("Nome do Gato" + this.getNome()  + );
    }
}
