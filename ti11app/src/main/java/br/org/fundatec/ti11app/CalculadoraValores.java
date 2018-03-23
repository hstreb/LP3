package br.org.fundatec.ti11app;

import java.time.LocalDate;

public interface CalculadoraValores {
    // calcula valor que o motorista ira receber
    Double calcularValorMotorista(Motorista motorista, LocalDate dataInicio, LocalDate dataFim);

    // calcula o valor devido pelo passageiro
//    double calcularValorPassageiro(Passageiro passageiro);
}
