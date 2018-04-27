package abstractfactory.problema;

public class EscolaEnsinoTecnico {

    private SalaNormal sala;

    public EscolaEnsinoTecnico(SalaNormal sala) {
        this.sala = sala;
    }

    public SalaNormal getSala() {
        return sala;
    }

    @Override
    public String toString() {
        return "EscolaEnsinoTecnico{" +
                "sala=" + sala +
                '}';
    }
}
