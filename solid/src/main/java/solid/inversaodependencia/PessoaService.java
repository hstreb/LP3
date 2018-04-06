package solid.inversaodependencia;

public class PessoaService {
    private PessoaDao pessoaDao = new PessoaDao();

    public void listar() {
        pessoaDao.listar();
    }
}
