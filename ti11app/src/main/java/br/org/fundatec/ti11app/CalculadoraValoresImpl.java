package br.org.fundatec.ti11app;

import java.time.LocalDate;

public class CalculadoraValoresImpl implements CalculadoraValores {

	// calcula valor que o motorista ira receber
	@Override
	public Double calcularValorMotorista(Motorista motorista,
			LocalDate dataViagemInicio, LocalDate dataViagemFim) {
		double valorCorrida = 0;

		for (Passageiro passageiro : motorista.getListaDePassageiro()) {
			//System.out.println(passageiro.getNome() + " " + ((passageiro.getQuantidadeMinutos() * 0.50) + (passageiro.getKmRodado() * 0.20)));
			if (passageiro.getDataViagem().compareTo(dataViagemInicio) >= 0
					&& passageiro.getDataViagem().compareTo(dataViagemFim) <= 0) {
				valorCorrida += (passageiro.getQuantidadeMinutos() * 0.50) + (passageiro.getKmRodado() * 0.20);
			}
		}
		return valorCorrida;
	}

	// calcula o valor devido pelo passageiro
	@Override
	public double calcularValorPassageiro(Passageiro passageiro) {
		double resultado = (passageiro.getQuantidadeMinutos() * 0.50) + (passageiro.getKmRodado() * 0.20);
		return resultado + (resultado * 0.15);
	}
	
	
}
