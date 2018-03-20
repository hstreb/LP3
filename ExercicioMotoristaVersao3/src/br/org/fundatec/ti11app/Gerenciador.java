package br.org.fundatec.ti11app;

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
		Double valorMotorista = calculadora.calcularValorMotorista(motorista, "2018-02-01", "2018-03-30");
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
