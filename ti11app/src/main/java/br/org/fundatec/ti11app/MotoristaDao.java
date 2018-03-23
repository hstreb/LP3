package br.org.fundatec.ti11app;

import java.util.Optional;

public interface MotoristaDao {
    Optional<Motorista> buscarPorNome(String nome);
    void adicionar(Motorista motorista);
}
