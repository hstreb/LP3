package br.org.fundatec.ti11app;

import java.util.ArrayList;
import java.util.List;

public class MotoristaDaoNaMemoria implements MotoristaDao {

    private Motorista motorista;

    public MotoristaDaoNaMemoria() {
        Passageiro maria = new Passageiro("Maria", 12.0, 5, "2018-02-15");
        Passageiro nathalia = new Passageiro("Nathalia", 50.0, 30, "2018-02-18");
        Passageiro raizen = new Passageiro("Raizen", 20.0, 13, "2018-03-10");
        Passageiro ilidan = new Passageiro("Ilidan", 70, 60, "2018-03-27");

        List<Passageiro> listaDePassageiro  = new ArrayList<>();
        listaDePassageiro.add(maria);
        listaDePassageiro.add(nathalia);
        listaDePassageiro.add(raizen);
        listaDePassageiro.add(ilidan);

        motorista = new Motorista("João", listaDePassageiro);
    }

    @Override
    public Motorista getMotorista() {
        return motorista;
    }
}
