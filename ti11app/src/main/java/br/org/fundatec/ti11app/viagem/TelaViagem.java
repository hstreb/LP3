package br.org.fundatec.ti11app.viagem;

import br.org.fundatec.ti11app.FormatadorDeData;
import br.org.fundatec.ti11app.motorista.Motorista;
import br.org.fundatec.ti11app.passageiro.Passageiro;

import java.time.LocalDate;
import java.util.Scanner;

public class TelaViagem {
    private ViagemService viagemService;
    private FormatadorDeData formatadorDeData;
    private Scanner scanner;

    private void adicionarViagem() {
        System.out.println("Digite o nome do passageiro");
        String nomePassageiro = scanner.next();

        System.out.println("Digite o nome do motorista");
        String nomeMotorista = scanner.next();

        System.out.println("Digite a quantidade de km rodados");
        double kmRodados = scanner.nextDouble();

        System.out.println("Digite a quantidade de minutos");
        int qtdMinutos = scanner.nextInt();

        System.out.println("Digite a data");
        String dataViagem = scanner.next();

        ViagemDTO dto = new ViagemDTO(nomeMotorista, nomePassageiro, kmRodados, qtdMinutos,dataViagem );

        viagemService.adicionaViagem(dto);
        System.out.println("viagem adicionada");

    }
}
