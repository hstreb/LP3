package solid.segregacaointerface.aplicacao;

public class MotoristaCaminhao implements Motorista {
    @Override
    public void andar() {
        System.out.println("Motorista caminhao anda dirigindo com braço pra fora");
    }

    @Override
    public void possuiHabilitacao() {
        System.out.println("Motorista Caminhao >= C");
    }
}
