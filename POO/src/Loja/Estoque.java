package Loja;

public class Estoque {
    private String nomeProduto;
    private float preco;
    private int quantidadeEstoque;

    public Estoque (String nomeProduto, float preco, int quantidadeEstoque){
        this.nomeProduto = nomeProduto;
        this.preco = preco;
        this.quantidadeEstoque = quantidadeEstoque;
    }
    public Estoque(){

    }

    public String getNomeProduto() {
        return nomeProduto;
    }

    public void setNomeProduto(String nomeProduto) {
        this.nomeProduto = nomeProduto;
    }

    public float getPreco() {
        return preco;
    }

    public void setPreco(float preco) {
        this.preco = preco;
    }

    public int getQuantidadeEstoque() {
        return quantidadeEstoque;
    }

    public void setQuantidadeEstoque(int quantidadeEstoque) {
        this.quantidadeEstoque = quantidadeEstoque;
    }

    @Override
    public String toString() {
        return "Estoque{" +
                "\nnomeProduto='" + nomeProduto + ""+
                ", \npreco=" + preco + "" +
                ", \nquantidadeEstoque =" + quantidadeEstoque;

    }
}
