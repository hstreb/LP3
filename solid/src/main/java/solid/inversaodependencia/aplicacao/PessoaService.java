package solid.inversaodependencia.aplicacao;

public class PessoaService {
    private PessoaDao pessoaDao;

    public PessoaService(PessoaDao pessoaDao) {
        this.pessoaDao = pessoaDao;
    }

    public void listar() {
        pessoaDao.listar();
    }
}
