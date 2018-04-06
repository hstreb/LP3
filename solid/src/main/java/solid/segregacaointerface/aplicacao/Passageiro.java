package solid.segregacaointerface.aplicacao;

public class Passageiro implements Pessoa {
    @Override
    public void andar() {
        System.out.println("Passageiro anda de carona");
    }
}
