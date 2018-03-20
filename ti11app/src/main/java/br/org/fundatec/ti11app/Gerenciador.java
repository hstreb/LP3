package br.org.fundatec.ti11app;

import java.time.LocalDate;

public class Gerenciador {

	private InterfaceDoUsuario interfaceDoUsuario;
	private CalculadoraValores calculadora;
	private MotoristaDao motoristaDao;

	public Gerenciador(InterfaceDoUsuario interfaceDoUsuario,
					   CalculadoraValores calculadora, MotoristaDao motoristaDao) {
		this.interfaceDoUsuario = interfaceDoUsuario;
		this.calculadora = calculadora;
		this.motoristaDao = motoristaDao;
	}

	public void imprimeValorMotorista() {
		Motorista motorista = motoristaDao.getMotorista();
		Double valorMotorista = calculadora.calcularValorMotorista(motorista, LocalDate.of(2018, 2, 1), LocalDate.of(2018, 3, 0));
		interfaceDoUsuario.mostrarValorMotorista(motorista, valorMotorista);
	}

	public void imprimeValorPassageiros() {
		Motorista motorista = motoristaDao.getMotorista();
		for (Passageiro passageiro : motorista.getListaDePassageiro()) {
			Double valor = calculadora.calcularValorPassageiro(passageiro);
			interfaceDoUsuario.mostrarValorPassageiro(passageiro, valor);
		}
	}

}
