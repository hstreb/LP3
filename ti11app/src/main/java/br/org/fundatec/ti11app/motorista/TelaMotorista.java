package br.org.fundatec.ti11app.motorista;

import java.util.Scanner;

public class TelaMotorista {

    private MotoristaService motoristaService;
    private Scanner scanner;


    public TelaMotorista(MotoristaService motoristaService, Scanner scanner) {
        this.motoristaService = motoristaService;
        this.scanner = scanner;
    }

    public void adicionarMotorista() {
        System.out.println("Digite o nome do motorista:");
        String nome = scanner.next();
        motoristaService.adicionar(new Motorista(nome));
    }
}
