package solid.abertofechado.aplicacao;

public class Retangulo implements Forma {
    private double altura;
    private double largura;

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getLargura() {
        return largura;
    }

    public void setLargura(double largura) {
        this.largura = largura;
    }

    @Override
    public double area() {
        return this.getAltura() * this.getLargura();
    }
}
