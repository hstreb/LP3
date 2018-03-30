package exemplo;

public class Passageiro implements Pessoa {
    @Override
    public void andar() {
        System.out.println("Passageiro: de carona");
    }
}
