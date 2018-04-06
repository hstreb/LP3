package solid.inversaodependencia.aplicacao;

public class App {
    public static void main(String[] args) {
        PessoaService service = new PessoaService(new PessoaDaoTI11());
        service.listar();
    }
}
