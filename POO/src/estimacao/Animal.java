package estimacao;

public abstract class Animal {
    private  String nome;
    private int idade;

    public Animal(String nome, int idade){
        this.nome = nome;
        this.idade = idade;
    }
    public Animal() {
    }
        public abstract void emitirsom();

        public abstract void comer();

        public abstract void exibirinfo();

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
}



