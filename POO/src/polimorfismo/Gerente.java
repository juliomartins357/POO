package polimorfismo;

public class Gerente extends Funcionario{
    private int projetosGerenciados;


    public Gerente(String nome, double salariobase) {
        super(nome, salariobase);
        this.projetosGerenciados = 0;

    }

    public int getProjetosGerenciados() {
        return projetosGerenciados;
    }

    public void setProjetosGerenciados(int projetosGerenciados) {
        this.projetosGerenciados = projetosGerenciados;
    }

    @Override
    public double calculabonus() {
        return this.getSalariobase() * 0.15;
    }
}
