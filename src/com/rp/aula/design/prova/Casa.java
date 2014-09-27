package com.rp.aula.design.prova;

import java.util.ArrayList;
import java.util.List;

public class Casa {
	private List<String> quartos;
	private List<String> salas;
	private List<String> cozinhas;
	private List<String> banheiros;
	
	private Casa() {
		
	}
	
	private Casa(CasaBuilder builder) {
		this.banheiros = builder.banheiros;
		this.salas = builder.salas;
		this.quartos = builder.quartos;
		this.salas = builder.salas;
	}
	
	public static class CasaBuilder {
		private List<String> quartos = new ArrayList<String>();
		private List<String> salas =  new ArrayList<String>();
		private List<String> cozinhas = new ArrayList<String>();
		private List<String> banheiros = new ArrayList<String>();
		
		public CasaBuilder addQuarto(String quarto) {
			this.quartos.add(quarto);
			return this;
		}
		
		public CasaBuilder addCozinha(String cozinha) {
			cozinhas.add(cozinha);
			return this;
		}
		
		public CasaBuilder addSala(String sala) {
			this.salas.add(sala);
			return this;
		}
		
		public CasaBuilder banheiros(String banheiro) {
			this.banheiros.add(banheiro);
			return this;
		}
		
		public Casa build() {
			if (banheiros.size() == 0) {
				throw new IllegalArgumentException("Número de banheiros inválido");
			}
			
			if (quartos.size() == 0) {
				throw new IllegalArgumentException("Número de quartos inválido");
			}
			
			if (cozinhas.size() == 0) {
				throw new IllegalArgumentException("Número de cozinhas inválido");
			}
			
			if (salas.size() == 0) {
				throw new IllegalArgumentException("Número de salas inválido");
			}
			
			return new Casa(this);
		}
		
		
	}
	
}
