package abstractfactory;

public class ConstrutorEscolaEnsinoMedio extends ConstrutorEscola {
    @Override
    public Escola construir() {
        return new EscolaEnsinoMedio(new SalaNormal());
    }
}
