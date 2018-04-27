package abstractfactory;

public class EscolaEnsinoPrimario extends Escola {
    public EscolaEnsinoPrimario(Sala sala) {
        super(sala);
    }

    @Override
    public String toString() {
        return "EscolaEnsinoPrimario{" +
                "sala=" + getSala() +
                '}';
    }
}
