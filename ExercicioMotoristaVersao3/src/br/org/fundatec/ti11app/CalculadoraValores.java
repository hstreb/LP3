package br.org.fundatec.ti11app;

public interface CalculadoraValores {
    // calcula valor que o motorista ira receber
    Double calcularValorMotorista(Motorista motorista, String dataInicio, String dataFim);

    // calcula o valor devido pelo passageiro
    double calcularValorPassageiro(Passageiro passageiro);
}
