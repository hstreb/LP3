package abstractfactory;

public abstract class Escola {

    public static final int ENSINO_PRIMARIO = 1;
    public static final int ENSINO_MEDIO = 2;

    private Sala sala;

    public Escola(Sala sala) {
        this.sala = sala;
    }

    public Sala getSala() {
        return sala;
    }
}
