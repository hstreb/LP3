package br.org.fundatec.ti11app;

public class Main {
    public static void main(String[] args) {


        Configuracao configuracao = new Configuracao();
        Gerenciador gerenciador = configuracao.configurarGerenciador();
        gerenciador.imprimeValorMotorista();
        gerenciador.imprimeValorPassageiros();

    }
}
