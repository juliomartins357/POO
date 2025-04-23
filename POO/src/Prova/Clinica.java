package Prova;

public class Clinica {
    private String nome;
    private int cpf;
    private String email;

    public Clinica (String nome, int cpf, String email){
        this.nome = nome;
        this.cpf = cpf;
        this.email = email;
    }
    public Clinica(){

    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getCpf() {
        return cpf;
    }

    public void setCpf(int cpf) {
        this.cpf = cpf;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Clinica{" +
                " \nnome='" + nome + "" +
                ", \ncpf=" + cpf + "" +
                ", email = '" + email;

    }
}
