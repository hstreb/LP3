package solid.inversaodependencia.aplicacao;

public class PessoaDaoSimpsons implements PessoaDao {
    @Override
    public void listar() {
        System.out.println("Pessoas{ Homer, Margie, Bart, Lisa, Megie }");
    }
}
