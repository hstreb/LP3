package br.org.fundatec.ti11app;

import java.time.LocalDate;
import java.util.Objects;

public class Passageiro {

	private String nome;
	private double kmRodado;
	private int quantidadeMinutos;
	private LocalDate dataViagem;

	public Passageiro(String nome, double kmRodado, int quantidadeMinutos, LocalDate dataViagem) {
		this.nome = nome;
		this.kmRodado = kmRodado;
		this.quantidadeMinutos = quantidadeMinutos;
		this.dataViagem = dataViagem;
	}

	public LocalDate getDataViagem() {
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

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		Passageiro that = (Passageiro) o;
		return Double.compare(that.kmRodado, kmRodado) == 0 &&
				quantidadeMinutos == that.quantidadeMinutos &&
				Objects.equals(nome, that.nome) &&
				Objects.equals(dataViagem, that.dataViagem);
	}

	@Override
	public int hashCode() {

		return Objects.hash(nome, kmRodado, quantidadeMinutos, dataViagem);
	}
}
