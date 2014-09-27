package com.rp.aula.design.javabean;

public class Veiculo {

	private String marca; // obrigatorio
	private String modelo; // obrigatorio
	private int anoFabricacao; // obrigatorio
	private int anoModelo; // obrigatorio
	private String placa; // obrigatorio
	private String renavam; // obrigatorio

	private String tipoCombustivel; // opcional
	private int numeroPortas; // opcional
	private boolean cambioAutomatico; // opcional
	private boolean freioABS; // opcional
	private boolean vidroEletrico; // opcional

	public Veiculo() {

	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public int getAnoFabricacao() {
		return anoFabricacao;
	}

	public void setAnoFabricacao(int anoFabricacao) {
		this.anoFabricacao = anoFabricacao;
	}

	public int getAnoModelo() {
		return anoModelo;
	}

	public void setAnoModelo(int anoModelo) {
		this.anoModelo = anoModelo;
	}

	public String getPlaca() {
		return placa;
	}

	public void setPlaca(String placa) {
		this.placa = placa;
	}

	public String getRenavam() {
		return renavam;
	}

	public void setRenavam(String renavam) {
		this.renavam = renavam;
	}

	public String getTipoCombustivel() {
		return tipoCombustivel;
	}

	public void setTipoCombustivel(String tipoCombustivel) {
		this.tipoCombustivel = tipoCombustivel;
	}

	public int getNumeroPortas() {
		return numeroPortas;
	}

	public void setNumeroPortas(int numeroPortas) {
		this.numeroPortas = numeroPortas;
	}

	public boolean isCambioAutomatico() {
		return cambioAutomatico;
	}

	public void setCambioAutomatico(boolean cambioAutomatico) {
		this.cambioAutomatico = cambioAutomatico;
	}

	public boolean isFreioABS() {
		return freioABS;
	}

	public void setFreioABS(boolean freioABS) {
		this.freioABS = freioABS;
	}

	public boolean isVidroEletrico() {
		return vidroEletrico;
	}

	public void setVidroEletrico(boolean vidroEletrico) {
		this.vidroEletrico = vidroEletrico;
	}

	@Override
	public String toString() {
		return "Veiculo [marca=" + marca + ", modelo=" + modelo
				+ ", anoFabricacao=" + anoFabricacao + ", anoModelo="
				+ anoModelo + ", placa=" + placa + ", renavam=" + renavam
				+ ", tipoCombustivel=" + tipoCombustivel + ", numeroPortas="
				+ numeroPortas + ", cambioAutomatico=" + cambioAutomatico
				+ ", freioABS=" + freioABS + ", vidroEletrico=" + vidroEletrico
				+ "]";
	}

	public static void main(String[] args) {
		Veiculo palio = new Veiculo();
		palio.setMarca("Fiat");
		palio.setModelo("Pálio");

		palio.setAnoModelo(2014);
		// Regra inválida
		palio.setAnoFabricacao(2012);

		// se comentar a linha acima, o estado do automóvel fica inválido
		palio.setCambioAutomatico(false);

		// FALTA PREENCHER PLAVA E RENAVAM
		// OU SEJA, O OBJETO ESTÁ COM O ESTADO INVALIDO
		// SEGUNDO AS REGRAS DE NEGÓCIO

		System.out.println(palio);

	}
}
