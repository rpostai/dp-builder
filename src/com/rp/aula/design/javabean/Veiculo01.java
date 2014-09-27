package com.rp.aula.design.javabean;

public class Veiculo01 {

	private final String marca; // obrigatorio
	private final String modelo; // obrigatorio
	private final int anoFabricacao; // obrigatorio
	private final int anoModelo; // obrigatorio
	private final String placa; // obrigatorio
	private final String renavam; // obrigatorio

	private String tipoCombustivel; // opcional
	private int numeroPortas; // opcional
	private boolean cambioAutomatico; // opcional
	private boolean freioABS; // opcional
	private boolean vidroEletrico; // opcional

	public Veiculo01(String marca, String modelo, int anoFabricacao,
			int anoModelo, String placa, String renavam) {
		this.marca = marca;
		this.modelo = modelo;
		this.anoFabricacao = anoFabricacao;
		this.anoModelo = anoModelo;
		this.placa = placa;
		this.renavam = renavam;

		if (this.marca == null) {
			throw new IllegalArgumentException("Marca é obrigatório");
		}

		if (anoFabricacao > anoModelo + 1) {
			throw new IllegalArgumentException(
					"Ano de fabricação deve ser o mesmo do ano do modelo ou no máximo 1 a mais");
		}

	}

	public Veiculo01(String marca, String modelo, int anoFabricacao,
			int anoModelo, String placa, String renavam,
			String tipoCombustivel, int numeroPortas, boolean cambioAutomatico,
			boolean freioABS, boolean vidroEletrico) {
		this.marca = marca;
		this.modelo = modelo;
		this.anoFabricacao = anoFabricacao;
		this.anoModelo = anoModelo;
		this.placa = placa;
		this.renavam = renavam;
		this.tipoCombustivel = tipoCombustivel;
		this.numeroPortas = numeroPortas;
		this.cambioAutomatico = cambioAutomatico;
		this.freioABS = freioABS;
		this.vidroEletrico = vidroEletrico;
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
		return "Veiculo01 [marca=" + marca + ", modelo=" + modelo
				+ ", anoFabricacao=" + anoFabricacao + ", anoModelo="
				+ anoModelo + ", placa=" + placa + ", renavam=" + renavam
				+ ", tipoCombustivel=" + tipoCombustivel + ", numeroPortas="
				+ numeroPortas + ", cambioAutomatico=" + cambioAutomatico
				+ ", freioABS=" + freioABS + ", vidroEletrico=" + vidroEletrico
				+ "]";
	}

	public static void main(String[] args) {
		Veiculo01 palio = new Veiculo01("Fiat", "Pálio", 2012, 2013,
				"AAA-1111", "RENAVAM001");
		// se comentar a linha acima, o estado do automóvel fica inválido
		palio.setCambioAutomatico(false);

		// SE INVERTERMOS A ORDEM DOS ANOS, O COMPILADOR EMITIRÁ ERRO?
		// NÃO
		palio = new Veiculo01("Fiat", "Pálio", 2013, 2012, "AAA-1111",
				"RENAVAM001");
		// PORÉM A REGRA DE NEGÓCIO FICARÁ COMPROMETIDA
		System.out.println(palio);

		Veiculo01 gol = new Veiculo01("Gol", "Volskwahgen", 2014, 2014,
				"93938888585", "AAA-4444", "", 0,
				true, false, false);
	}

}
