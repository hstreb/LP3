package abstractfactory.problema;

public class SalaNormal {
    private final String cadeira = "Cadeira normal";

    public String getCadeira() {
        return cadeira;
    }

    @Override
    public String toString() {
        return "SalaNormal{" +
                "cadeira='" + cadeira + '\'' +
                '}';
    }
}
