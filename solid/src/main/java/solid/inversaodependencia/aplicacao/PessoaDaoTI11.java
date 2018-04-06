package solid.inversaodependencia.aplicacao;

public class PessoaDaoTI11 implements PessoaDao {
    @Override
    public void listar() {
        System.out.println("Pessoas{ Arthur, Douglas, Nathalia, Joao Pedro Ferrari, Joao Pedro Martins }");
    }
}
