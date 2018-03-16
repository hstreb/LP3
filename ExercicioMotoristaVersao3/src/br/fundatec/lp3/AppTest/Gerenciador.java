package br.fundatec.lp3.AppTest;

import br.fundatec.lp3.MotoristaDao;
import br.fundatec.lp3.calculaCorrida.CalculadoraValores;
import br.fundatec.lp3.motorista.Motorista;
import br.fundatec.lp3.passageiro.Passageiro;

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

	public void rodar() {
		Motorista motorista = motoristaDao.getMotorista();
		Double valorMotorista = calculadora.calcularValorMotorista(motorista, "2018-02-01", "2018-03-30");
		interfaceDoUsuario.mostrarValorMotorista(motorista, valorMotorista);

		for (Passageiro passageiro : motorista.getListaDePassageiro()) {
			Double valor = calculadora.calcularValorPassageiro(passageiro);
			interfaceDoUsuario.mostrarValorPassageiro(passageiro, valor);
		}
	}
}
