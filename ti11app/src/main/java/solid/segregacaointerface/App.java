package solid.segregacaointerface;

public class App {
    public static void main(String[] args) {
        App app = new App();
        Motorista motorista = new Motorista();
        Passageiro passageiro = new Passageiro();

        app.andar(motorista);
        app.andar(passageiro);

        app.dirigir(motorista);
    }

    private void andar(Passageiro passageiro) {
        passageiro.andar();
    }

    private void andar(Motorista motorista) {
        motorista.andar();
    }

    private void dirigir(Motorista motorista) {
        motorista.andar();
        motorista.possuiHabilitacao();
    }
}
