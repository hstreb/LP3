package solid.substituicaoliskov;

public abstract class Conta {

    protected double saldo = 0;

    public double getSaldo() {
        return saldo;
    }

    abstract void render();

}
