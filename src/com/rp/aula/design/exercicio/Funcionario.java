package com.rp.aula.design.exercicio;

public class Funcionario {

	private final String nome;
	private final String cpf;
	private final String rg;

	private String ctps;
	private String pis;

	private Funcionario(FuncionarioBuilder builder) {
		this.nome = builder.nome;
		this.cpf = builder.cpf;
		this.rg = builder.rg;
		this.ctps = builder.ctps;
		this.pis = builder.pis;
	}

	public static class FuncionarioBuilder {
		private String nome;
		private String cpf;
		private String rg;

		private String ctps;
		private String pis;

		public FuncionarioBuilder nome(String nome) {
			this.nome = nome;
			return this;
		}

		public FuncionarioBuilder cpf(String cpf) {
			this.cpf = cpf;
			return this;
		}

		public FuncionarioBuilder rg(String rg) {
			this.rg = rg;
			return this;
		}

		public FuncionarioBuilder ctps(String ctps) {
			this.ctps = ctps;
			return this;
		}
		
		public FuncionarioBuilder pis(String pis) {
			this.pis = pis;
			return this;
		}

		public Funcionario build() {
			if (nome == null) {
				throw new IllegalStateException("campo nome é obrigatório");
			}
			if (rg == null) {
				throw new IllegalStateException("Campo rg é obrigatório");
			}

			if (cpf == null) {
				throw new IllegalStateException("campo cpf é obrigatório");
			}

			if (ctps != null) {
				if (pis == null) {
					throw new IllegalArgumentException(
							"campo pis é obrigatório quando preenchido a ctps");
				}
			}

			Funcionario f = new Funcionario(this);
			return f;
		}
	}

	@Override
	public String toString() {
		return "Funcionario [nome=" + nome + ", cpf=" + cpf + ", rg=" + rg
				+ ", ctps=" + ctps + ", pis=" + pis + "]";
	}

}
