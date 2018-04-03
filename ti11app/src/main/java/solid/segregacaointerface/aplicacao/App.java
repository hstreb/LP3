package solid.segregacaointerface.aplicacao;

public class App {
    public static void main(String[] args) {
        App app = new App();
        Motorista motoristaCaminhao = new MotoristaCaminhao();
        Motorista motoristaOnibus = new MotoristaOnibus();
        Pessoa passageiro = new Passageiro();

        app.andar(motoristaCaminhao);
        app.andar(motoristaOnibus);
        app.andar(passageiro);

        app.dirigir(motoristaCaminhao);
        app.dirigir(motoristaOnibus);
    }

    private void andar(Pessoa pessoa) {
        pessoa.andar();
    }

    private void dirigir(Motorista motorista) {
        motorista.andar();
        motorista.possuiHabilitacao();
    }
}
