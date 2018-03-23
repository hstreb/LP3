package br.org.fundatec.ti11app;

import java.time.LocalDate;

public class MotoristaService {

    private MotoristaDao motoristaDao;
    private CalculadoraValores calculadoraValores;

    public MotoristaService(MotoristaDao motoristaDao, CalculadoraValores calculadoraValores) {
        this.motoristaDao = motoristaDao;
        this.calculadoraValores = calculadoraValores;
    }

    public double calcularValorAReceber(String nome, LocalDate inicio, LocalDate fim) {
        return motoristaDao.buscarPorNome(nome)
                .map(motorista -> calculadoraValores.calcularValorMotorista(motorista, inicio, fim))
                .orElse(0.0);
    }

    public void adicionar(Motorista motorista) {
        if (motoristaDao.buscarPorNome(motorista.getNome()).isPresent()) {
            System.out.println("nome " + motorista.getNome() + " já existe!");
            return;
        }
        motoristaDao.adicionar(motorista);
    }
}
