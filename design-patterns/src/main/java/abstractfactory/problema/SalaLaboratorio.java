package abstractfactory.problema;

public class SalaLaboratorio extends SalaNormal {
    private Computador computador;

    public SalaLaboratorio(Computador computador) {
        this.computador = computador;
    }

    @Override
    public String toString() {
        return "SalaLaboratorio{" +
                "cadeira='" + getCadeira() + "\'," +
                "computador=" + computador +
                '}';
    }
}
