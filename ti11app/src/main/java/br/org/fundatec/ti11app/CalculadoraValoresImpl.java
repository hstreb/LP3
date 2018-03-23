package br.org.fundatec.ti11app;

import java.time.LocalDate;

public class CalculadoraValoresImpl implements CalculadoraValores {

	// calcula valor que o motorista ira receber
	@Override
	public Double calcularValorMotorista(Motorista motorista,
			LocalDate dataViagemInicio, LocalDate dataViagemFim) {
		double valorCorrida = 0;

		for (Viagem Viagem : motorista.getViagens()) {
			//System.out.println(Viagem.getNome() + " " + ((Viagem.getQuantidadeMinutos() * 0.50) + (Viagem.getKmRodado() * 0.20)));
			if (Viagem.getDataViagem().compareTo(dataViagemInicio) >= 0
					&& Viagem.getDataViagem().compareTo(dataViagemFim) <= 0) {
				valorCorrida += (Viagem.getQuantidadeMinutos() * 0.50) + (Viagem.getKmRodado() * 0.20);
			}
		}
		return valorCorrida;
	}

	// calcula o valor devido pelo Viagem
//	@Override
//	public double calcularValorViagem(Viagem Viagem) {
//		double resultado = (Viagem.getQuantidadeMinutos() * 0.50) + (Viagem.getKmRodado() * 0.20);
//		return resultado + (resultado * 0.15);
//	}
	
	
}
