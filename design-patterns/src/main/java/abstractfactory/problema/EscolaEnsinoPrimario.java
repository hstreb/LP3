package abstractfactory.problema;

public class EscolaEnsinoPrimario {

    private SalaPrimario sala;

    public EscolaEnsinoPrimario(SalaPrimario sala) {
        this.sala = sala;
    }

    public SalaPrimario getSala() {
        return sala;
    }

    @Override
    public String toString() {
        return "EscolaEnsinoPrimario{" +
                "sala=" + sala +
                '}';
    }
}
