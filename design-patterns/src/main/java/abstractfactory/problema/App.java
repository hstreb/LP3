package abstractfactory.problema;

public class App {
    public static void main(String[] args) {
        EscolaEnsinoMedio ensinoMedio = new EscolaEnsinoMedio(new SalaNormal());
        System.out.println(ensinoMedio);
        EscolaEnsinoPrimario primario = new EscolaEnsinoPrimario(new SalaPrimario());
        System.out.println(primario);
        EscolaEnsinoTecnico tecnico = new EscolaEnsinoTecnico(new SalaLaboratorio(new Computador()));
        System.out.println(tecnico);
    }
}
