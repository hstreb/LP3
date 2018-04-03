package solid.responsabilidadeunica;
/*
Classe com mais de uma responsabilidade
 */
public class Pagamento {

    public double calculaSalarioDiretor(double base) {
        return base * 1.5;
    }

    public double calculaSalarioOperario(double base) {
        return base * 0.9;
    }

    public void mostraRelatorioSalario(double salario) {
        System.out.println("O salario é: " + salario);
    }
}
