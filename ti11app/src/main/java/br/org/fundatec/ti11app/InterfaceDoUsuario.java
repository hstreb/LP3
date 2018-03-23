package br.org.fundatec.ti11app;

import java.time.LocalDate;
import java.util.Scanner;

public class InterfaceDoUsuario {

    private MotoristaService motoristaService;
    private Scanner scanner;

    public InterfaceDoUsuario(MotoristaService motoristaService) {
        this.motoristaService = motoristaService;
        scanner = new Scanner(System.in);
    }

    public void iniciar() {
        boolean sair = true;
        while (sair) {
            System.out.println("Bem vindo!");
            System.out.println("Digite o número para escolher a opção desejada");
            System.out.println("1 - adicionar passageiro");
            System.out.println("2 - adicionar motorista");
            System.out.println("3 - adicionar viagem");
            System.out.println("4 - calcular valor devido de um passageiro");
            System.out.println("5 - calcular valor que o motorista deve recebe");

            int opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    adicionarPassageiro();
                    break;
                case 2:
                    adicionarMotorista();
                    break;
                case 3:
                    adicionarViagem();
                    break;
                case 4:
                    calcularValorDevidoDoPassageiro();
                    break;
                case 5:
                    calcularValorAReceberMotorista();
                    break;
                default:
                    System.out.println("opção não encontrada!");
                    sair = false;
                    break;
            }
        }
    }

    private void adicionarPassageiro() {
        // TODO chamar adição do passageiro
        System.out.println("adicionar passageiro");
    }

    private void adicionarMotorista() {
        System.out.println("Digite o nome do motorista:");
        String nome = scanner.next();
        motoristaService.adicionar(new Motorista(nome));
    }

    private void adicionarViagem() {
        // TODO chamar adição da viagem
        System.out.println("Digite o nome do passageiro!");
        String passageiro = scanner.next();

        System.out.println("Digite o nome do motorista!");
        String motorista = scanner.next();

        System.out.println("Digite a quantidade de km rodados!");
        String kmrodados = scanner.next();

        System.out.println("Digite a quantidade de minutos!");
        String qtdminutos = scanner.next();

        System.out.println("DIGITE A DATA!");
        LocalDate date = formatDate(scanner.next());





        //km rodado
        // qtd min
        //nome motorista
        //nomes passageiro
        //data
        System.out.println("adicionar viagem");


    }

    private void calcularValorDevidoDoPassageiro() {
        // TODO chamar calculo do valor devido de um passageiro
        System.out.println("calcular valor devido de um passageiro");
    }

    private void calcularValorAReceberMotorista() {
        System.out.println("Informe o nome do motorista:");
        String nomeMotorista = scanner.next();
        System.out.println("Informe a data inicio:");
        String dataInicio = scanner.next();
        //2018-03-21 <- formato data
        System.out.println("Informe a data de fim");
        String datafim = scanner.next();

        LocalDate inicio = formatDate(dataInicio);
        LocalDate fim = formatDate(datafim);
        System.out.println(inicio + " " + fim);
        double result = motoristaService.calcularValorAReceber(nomeMotorista, inicio, fim);
        System.out.println("calcular valor que o motorista deve recebe: " + result);
    }

    private LocalDate formatDate(String dataText) {
        return LocalDate.parse(dataText);
    }
}