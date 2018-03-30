package exemplo;

public class App {
    public static void main(String[] args) {
        App app = new App();
        app.andar(new MotoristaCaminhao());
        app.possuiHabilitacao(new MotoristaCaminhao());
        app.andar(new Passageiro());
    }

    private void andar(Pessoa pessoa) {
        pessoa.andar();
    }

    private void possuiHabilitacao(Motorista motorista) {
        motorista.andar();
        motorista.possuiHabilitacao();
    }
}
