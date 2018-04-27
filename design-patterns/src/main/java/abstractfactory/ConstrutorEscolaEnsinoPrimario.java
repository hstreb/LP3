package abstractfactory;

public class ConstrutorEscolaEnsinoPrimario extends ConstrutorEscola {
    @Override
    public Escola construir() {
        return new EscolaEnsinoPrimario(new SalaPrimario());
    }
}
