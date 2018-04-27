package abstractfactory;

public class EscolaEnsinoMedio extends Escola {

    public EscolaEnsinoMedio(Sala sala) {
        super(sala);
    }

    @Override
    public String toString() {
        return "EscolaEnsinoMedio{" +
                "sala=" + getSala() +
                '}';
    }
}
