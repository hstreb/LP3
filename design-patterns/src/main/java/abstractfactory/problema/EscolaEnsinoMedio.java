package abstractfactory.problema;

public class EscolaEnsinoMedio {

    private SalaNormal sala;

    public EscolaEnsinoMedio(SalaNormal sala) {
        this.sala = sala;
    }

    public SalaNormal getSala() {
        return sala;
    }

    @Override
    public String toString() {
        return "EscolaEnsinoMedio{" +
                "sala=" + sala +
                '}';
    }
}
