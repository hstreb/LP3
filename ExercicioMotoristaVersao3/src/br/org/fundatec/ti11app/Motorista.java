package br.org.fundatec.ti11app;

import java.util.List;

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
}
