package br.fundatec.lp3.AppTest;

import br.fundatec.lp3.motorista.Motorista;
import br.fundatec.lp3.passageiro.Passageiro;

public class InterfaceDoUsuario {
    public void mostrarValorMotorista(Motorista motorista, Double valor) {
        System.out.println("O motorista '" + motorista.getNome() + "' deve receber " + valor + " Reais.");
    }

    public void mostrarValorPassageiro(Passageiro passageiro, Double valor) {
        System.out.println("Valor devido pelo passageiro: " + passageiro.getNome() + " " + valor);
    }
}