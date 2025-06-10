package polimorfismo;

public class Funcionario {
   private String nome;
    private double salariobase;

    public Funcionario(String nome, double salariobase) {
        this.nome = nome;
        this.salariobase = salariobase;
    }

    public double getSalariobase() {
        return salariobase;
    }

    public void setSalariobase(double salariobase) {
        this.salariobase = salariobase;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double calculabonus() {
        System.out.println("Calculando bônus do funcionário");

        return 0;
    }
}
