package br.org.fundatec.ti11app;

import java.util.List;
import java.util.Objects;

public class Motorista {

	private String nome;
	private List<Passageiro> listaDePassageiro;
	
	public Motorista(String nome, List<Passageiro> listaDePassageiro) {
		this.nome = nome;
		this.listaDePassageiro = listaDePassageiro;
	}
	
	public String getNome() {
		return nome;
	}
	public List<Passageiro> getListaDePassageiro() {
		return listaDePassageiro;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		Motorista motorista = (Motorista) o;
		return Objects.equals(nome, motorista.nome) &&
				Objects.equals(listaDePassageiro, motorista.listaDePassageiro);
	}

	@Override
	public int hashCode() {

		return Objects.hash(nome, listaDePassageiro);
	}
}
