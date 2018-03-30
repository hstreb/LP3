package br.org.fundatec.ti11app;

import br.org.fundatec.ti11app.motorista.TelaMotorista;
import br.org.fundatec.ti11app.passageiro.TelaPassageiro;

import java.util.Scanner;

public class InterfaceMenu {

    private static final String MENU = "Bem Vindo!\n" +
            "Digite o número para escolher a opção desejada\n" +
            "1 - adicionar passageiro\n" +
            "2 - adicionar motorista\n" +
            "3 - adicionar viagem\n" +
            "4 - calcular valor devido de um passageiro\n" +
            "5 - calcular valor que o motorista deve recebe\n";

    private Scanner scanner;
    private TelaPassageiro telaPassageiro;
    private TelaMotorista telaMotorista;

    public InterfaceMenu(Scanner scanner, TelaPassageiro telaPassageiro, TelaMotorista telaMotorista) {
        this.scanner = scanner;
        this.telaPassageiro = telaPassageiro;
        this.telaMotorista = telaMotorista;
    }

    public void mostrarMenu() {
        boolean sair = true;

        while (sair) {
            System.out.println(MENU);
            int escolha = scanner.nextInt();
            sair = escolher(escolha);
        }
    }

    private boolean escolher(int escolha) {
        switch (escolha) {
            case 1:
                telaPassageiro.adicionarPassageiro();
                return true;
            case 2:
                telaMotorista.adicionarMotorista();
                return true;
            /*case 3:
                adicionarViagem();
                return true;
            case 4:
                calcularValorDevidoDoPassageiro();
                return true;
            case 5:
                calcularValorAReceberMotorista();
                return true;*/
            default:
                System.out.println("opção não encontrada!");
                return false;
        }

    }

    public static void main(String[] args) {
        InterfaceMenu ui = Configuracao.configInterfaceMenu();
        ui.mostrarMenu();
    }
}
