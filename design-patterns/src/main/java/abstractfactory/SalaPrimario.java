package abstractfactory;

public class SalaPrimario extends Sala {

    @Override
    public String getCadeira() {
        return "Cadeira pequena";
    }

    @Override
    public String toString() {
        return "SalaPrimario{" +
                "cadeira='" + getCadeira() + '\'' +
                '}';
    }
}
