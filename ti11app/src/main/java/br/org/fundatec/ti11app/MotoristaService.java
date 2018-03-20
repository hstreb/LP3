package br.org.fundatec.ti11app;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class MotoristaService {

    private List<Passageiro> passageiros = Arrays.asList(new Passageiro("outrociclano", 5.0, 25, LocalDate.of(2018, 1, 2)));
    private List<Motorista> motoristas = Arrays.asList(new Motorista("ciclano", passageiros));
    private CalculadoraValores calculadoraValores;

    public MotoristaService(CalculadoraValores calculadoraValores) {
        this.calculadoraValores = calculadoraValores;
    }

    public double calcularValorDevido(String nome, LocalDate inicio, LocalDate fim) {
        return motoristas.stream()
                .filter(m -> m.getNome().equals(nome))
                .findFirst()
                .map(m -> calculadoraValores.calcularValorMotorista(m, inicio, fim))
                .orElse(0.0);
//        for (Motorista motorista : motoristas) {
//            if (motorista.getNome().equals(nome)) {
//                return 10;
//            }
//        }
//        return 0.0;
    }
}
