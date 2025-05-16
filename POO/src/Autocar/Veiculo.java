package Autocar;

public class Veiculo {
    private String modeloveiculo;
    private double quilometragem;
    private String placa;

   public Veiculo(String modeloveiculo,double quilometragem, String placa){
       this.modeloveiculo = modeloveiculo;
       this.quilometragem = quilometragem;
       this.placa = placa;

   }

    public String getModeloveiculo() {
        return modeloveiculo;
    }

    public void setModeloveiculo(String modeloveiculo) {
        this.modeloveiculo = modeloveiculo;
    }

    public double getQuilometragem() {
        return quilometragem;
    }

    public void setQuilometragem(double quilometragem) {
        this.quilometragem = quilometragem;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public void observacoes(){
       System.out.println("Modelo  do  veículo:: " + modeloveiculo);
       System.out.println("Qilometragem" + quilometragem );
       System.out.println("Placa" + placa);
   }


}
