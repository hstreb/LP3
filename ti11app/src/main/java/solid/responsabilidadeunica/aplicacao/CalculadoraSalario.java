package solid.responsabilidadeunica.aplicacao;

public class CalculadoraSalario {

    public double calculaSalarioDiretor(double base) {
        return base * 1.5;
    }

    public double calculaSalarioOperario(double base) {
        return base * 0.9;
    }

}
