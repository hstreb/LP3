package solid.substituicaoliskov.aplicacao;

public class ContaCorrente extends Conta {
    @Override
    public void render() {
        saldo += 0.1;
    }
}
