package solid.segregacaointerface.aplicacao;

public class MotoristaOnibus implements Motorista {
    @Override
    public void andar() {
        System.out.println("Motorista onibus dirigindo");
    }

    @Override
    public void possuiHabilitacao() {
        System.out.println("Motorista onibus >=D");
    }
}
