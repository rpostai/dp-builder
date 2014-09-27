package com.rp.aula.design.builder01;


public class Diretor {
	
	private Builder builder;
	
	public Diretor(Builder builder) {
		this.builder = builder;
	}
	
	public Veiculo buildVeiculo() {
		return builder.build();
	}

}
