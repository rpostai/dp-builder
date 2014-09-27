package com.rp.aula.design.builder01;

public class AutomovelBuilder implements Builder {

	private String marca; // obrigatorio
	private String modelo; // obrigatorio
	private Integer anoModelo; // obrigatorio
	private Integer anoFabricacao; // obrigatorio
	private String placa; // obrigatorio
	private int quantidadePortas; // opcional
	private String combustivel; // opcional

	@Override
	public Builder marca(String marca) {
		this.marca = marca;
		return this;
	}

	@Override
	public Builder modelo(String modelo) {
		this.modelo = modelo;
		return this;
	}

	@Override
	public Builder anoModelo(int anoModelo) {
		this.anoModelo = anoModelo;
		return this;
	}

	@Override
	public Builder anoFabricacao(int anoFabricacao) {
		this.anoFabricacao = anoFabricacao;
		return this;
	}

	@Override
	public Builder placa(String placa) {
		this.placa = placa;
		return this;
	}

	@Override
	public Builder quantidadePortas(int quantidadePortas) {
		this.quantidadePortas = quantidadePortas;
		return this;
	}

	@Override
	public Builder combustivel(String combustivel) {
		this.combustivel = combustivel;
		return this;
	}

	@Override
	public Automovel build() {
		if (marca == null) {
			throw new IllegalArgumentException("marca é obrigatório");
		}
		return new Automovel(marca, modelo, anoModelo, anoFabricacao, placa,
				quantidadePortas, combustivel);
	}

}
