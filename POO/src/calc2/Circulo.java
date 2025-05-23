package calc2;

public class Circulo  extends Formageometrica{
    private  double raio;


    public Circulo(String cor, double raio){
        super(cor);
        this.raio = raio;


    }

    public double getRaio() {
        return raio;
    }

    public void setRaio(double raio) {
        this.raio = raio;
    }


    @Override
    public double calculaArea() {
        return  raio * 3.14 * 2;
    }

    @Override
    public double calculaPerimetro() {
        return   2 * 3.14 * raio;
    }

    @Override
    public double calculaVolume() {
        return (4/3) * 3.14 * (this.raio *this.raio*this.raio);
    }
}
