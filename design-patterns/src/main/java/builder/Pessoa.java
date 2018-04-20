package builder;

import java.time.LocalDate;

public class Pessoa {

	private String nome;
	private LocalDate dataNascimento;
	private String endereco;
//	private Endereco endereco;

	private Pessoa(String nome, LocalDate dataNascimento, String endereco) {
		this.nome = nome;
		this.dataNascimento = dataNascimento;
		this.endereco = endereco;
	}

	public String getNome() {
		return nome;
	}

	public LocalDate getDataNascimento() {
		return dataNascimento;
	}

	public String getEndereco() {
		return endereco;
	}

	public static PessoaBuilder builder() {
		return new PessoaBuilder();
	}

	public static class PessoaBuilder {

		private String nome;
		private LocalDate dataNascimento;
		private String endereco;

		public PessoaBuilder comNomeENascimento(String nome, LocalDate data) {
			this.nome = nome;
			this.dataNascimento = data;
			return this;
		}

		public PessoaBuilder comEndereco(String endereco) {
			this.endereco = endereco;
			return this;
		}

		public Pessoa construir() {
			if (dataNascimento.isAfter(LocalDate.now())) {
				throw new DataNascimentoInvalidaException();
			}
			if (nome.length() < 2) {
				throw new NomeInvalidoException();
			}
			return new Pessoa(nome, dataNascimento, endereco);
		}
	}
}
