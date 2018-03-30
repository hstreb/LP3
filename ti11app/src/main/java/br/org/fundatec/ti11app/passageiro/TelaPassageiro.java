package br.org.fundatec.ti11app.passageiro;

import br.org.fundatec.ti11app.passageiro.Passageiro;
import br.org.fundatec.ti11app.passageiro.PassageiroService;

import java.util.Scanner;

public class TelaPassageiro {

    private PassageiroService passageiroService;
    private Scanner scanner;

    public TelaPassageiro(PassageiroService passageiroService, Scanner scanner) {
        this.passageiroService = passageiroService;
        this.scanner = scanner;
    }

    public void adicionarPassageiro() {
        System.out.println("Informe o nome do passageiro");
        passageiroService.adicionar(new Passageiro(scanner.next()));
    }

}
