package br.fundatec.lp3.passageiro;

public class Passageiro {

	private String nome;
	private double kmRodado;
	private int quantidadeMinutos;
	private String dataViagem;

	public Passageiro(String nome, double kmRodado, int quantidadeMinutos, String dataViagem) {
		this.nome = nome;
		this.kmRodado = kmRodado;
		this.quantidadeMinutos = quantidadeMinutos;
		this.dataViagem = dataViagem;
	}

	public String getDataViagem() {
		return dataViagem;
	}

	public String getNome() {
		return nome;
	}

	public double getKmRodado() {
		return kmRodado;
	}

	public int getQuantidadeMinutos() {
		return quantidadeMinutos;
	}

}
