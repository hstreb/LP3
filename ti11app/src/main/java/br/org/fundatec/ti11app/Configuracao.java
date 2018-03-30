package br.org.fundatec.ti11app;

import br.org.fundatec.ti11app.calculadora.CalculadoraValoresImpl;
import br.org.fundatec.ti11app.motorista.TelaMotorista;
import br.org.fundatec.ti11app.motorista.MotoristaDaoNaMemoria;
import br.org.fundatec.ti11app.motorista.MotoristaService;
import br.org.fundatec.ti11app.passageiro.TelaPassageiro;
import br.org.fundatec.ti11app.passageiro.PassageiroDaoNaMemoria;
import br.org.fundatec.ti11app.passageiro.PassageiroService;
import br.org.fundatec.ti11app.viagem.*;

import java.util.Scanner;

public class Configuracao {
	public static InterfaceDoUsuario getUI() {
		return new InterfaceDoUsuario(configMotoristaService(),
				configPassageiroService(),
				configViagemService(),
				configFormatadorDeData());
	}

	public static FormatadorDeData configFormatadorDeData() {
		return new FormatadorDeData();
	}

	public static ViagemService configViagemService() {
		return new ViagemService(new ViagemDaoNaMemoria());
	}

	public static PassageiroService configPassageiroService() {
		return new PassageiroService(new PassageiroDaoNaMemoria(), new CalculadoraValoresImpl());
	}

	public static MotoristaService configMotoristaService() {
		return new MotoristaService(new MotoristaDaoNaMemoria(), new CalculadoraValoresImpl());
	}

	public static Scanner configScanner() {
		return new Scanner(System.in);
	}

	public static TelaPassageiro configInterfacePassageiro() {
		return new TelaPassageiro(configPassageiroService(), configScanner());
	}

	public static TelaMotorista configInterfaceMotorista(){
		return new TelaMotorista(configMotoristaService(), configScanner());
	}



	public static InterfaceMenu configInterfaceMenu() {
		return new InterfaceMenu(configScanner(), configInterfacePassageiro(), configInterfaceMotorista());
	}
}
