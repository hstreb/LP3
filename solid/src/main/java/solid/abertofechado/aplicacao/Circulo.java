package solid.abertofechado.aplicacao;

public class Circulo implements Forma {
    public static final double PI = 3.14;
    private double raio;

    public double getRaio() {
        return raio;
    }

    public void setRaio(double raio) {
        this.raio = raio;
    }

    @Override
    public double area() {
        return this.getRaio() * this.getRaio() * PI;
    }
}
