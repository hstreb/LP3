package br.fundatec.lp3.calculaCorrida;

import br.fundatec.lp3.motorista.Motorista;
import br.fundatec.lp3.passageiro.Passageiro;

public interface CalculadoraValores {
    // calcula valor que o motorista ira receber
    Double calcularValorMotorista(Motorista motorista, String dataInicio, String dataFim);

    // calcula o valor devido pelo passageiro
    double calcularValorPassageiro(Passageiro passageiro);
}
