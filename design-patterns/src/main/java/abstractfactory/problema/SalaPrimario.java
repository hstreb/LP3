package abstractfactory.problema;

public class SalaPrimario {
    private final String cadeira = "Cadeira pequena";

    public String getCadeira() {
        return cadeira;
    }

    @Override
    public String toString() {
        return "SalaPrimario{" +
                "cadeira='" + cadeira + '\'' +
                '}';
    }
}
