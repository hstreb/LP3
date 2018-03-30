package exemplo;

public class MotoristaCaminhao implements Motorista {
    @Override
    public void andar() {
        System.out.println("Motorista: dirigindo");
    }

    @Override
    public void possuiHabilitacao() {
        System.out.println("Motorista Caminhao: >=C");
    }
}
