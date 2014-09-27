package com.rp.aula.design.exercicio;

public class Sistema {

	public static void main(String[] args) {
		Funcionario maria = new Funcionario.FuncionarioBuilder()
				.nome("Maria da Silva").cpf("88899988890").rg("3334443344")
				.build();

		Funcionario jose = new Funcionario.FuncionarioBuilder()
				.nome("José da Silva").cpf("00000220020").rg("998847877")
				.ctps("9984883").pis("a94949").build();
		

		System.out.println(jose);
		System.out.println(maria);

	}
}
