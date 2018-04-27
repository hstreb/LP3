package abstractfactory;

public class SalaNormal extends Sala {

    @Override
    public String getCadeira() {
        return "Cadeira normal";
    }

    @Override
    public String toString() {
        return "SalaNormal{" +
                "cadeira='" + getCadeira() + '\'' +
                '}';
    }
}
