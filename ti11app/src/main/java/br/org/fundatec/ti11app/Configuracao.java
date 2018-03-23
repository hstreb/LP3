package br.org.fundatec.ti11app;

public class Configuracao {
    public static InterfaceDoUsuario getUI() {
        return new InterfaceDoUsuario(new MotoristaService(new MotoristaDaoNaMemoria(), new CalculadoraValoresImpl()));
    }
}
