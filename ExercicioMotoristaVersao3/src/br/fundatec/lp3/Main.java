package br.fundatec.lp3;

import br.fundatec.lp3.AppTest.Gerenciador;
import br.fundatec.lp3.AppTest.InterfaceDoUsuario;
import br.fundatec.lp3.calculaCorrida.CalculadoraValoresImpl;

public class Main {
    public static void main(String[] args) {
        new Gerenciador(new InterfaceDoUsuario(), new CalculadoraValoresImpl(), new MotoristaDaoNaMemoria())
                .rodar();
    }
}
