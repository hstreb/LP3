package br.org.fundatec.ti11app;

public class Configuracao {

        public Gerenciador configurarGerenciador (){
            return new Gerenciador(
                    new InterfaceDoUsuario(), new CalculadoraValoresImpl(), new MotoristaDaoNaMemoria());
        }
}
