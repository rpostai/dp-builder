package com.rp.aula.design.builder00;

public class Veiculo {

    private final String marca; // obrigatorio
    private final String modelo; // obrigatorio
    private final Integer anoModelo; // obrigatorio
    private final Integer anoFabricacao; // obrigatorio
    private final String placa; // obrigatorio
    private final int quantidadePortas; // opcional
    private final String combustivel; // opcional

    private Veiculo(VeiculoBuilder builder) {
        marca = builder.marca;
        modelo = builder.modelo;
        anoModelo = builder.anoModelo;
        anoFabricacao = builder.anoFabricacao;
        placa = builder.placa;
        quantidadePortas = builder.quantidadePortas;
        combustivel = builder.combustivel;
    }

    public static class VeiculoBuilder {

        private String marca; // obrigatorio
        private String modelo; // obrigatorio
        private Integer anoModelo; // obrigatorio
        private Integer anoFabricacao; // obrigatorio
        private String placa; // obrigatorio
        private int quantidadePortas; // opcional
        private String combustivel; // opcional

        public VeiculoBuilder marca(String marca) {
            this.marca = marca;
            return this;
        }

        public VeiculoBuilder modelo(String modelo) {
            this.modelo = modelo;
            return this;
        }

        public VeiculoBuilder anoModelo(Integer anoModelo) {
            this.anoModelo = anoModelo;
            return this;
        }

        public VeiculoBuilder anoFabricacao(Integer anoFabricacao) {
            this.anoFabricacao = anoFabricacao;
            return this;
        }

        public VeiculoBuilder placa(String placa) {
            this.placa = placa;
            return this;
        }

        public VeiculoBuilder quantidadePortas(int quantidadePortas) {
            this.quantidadePortas = quantidadePortas;
            return this;
        }

        public VeiculoBuilder combustivel(String combustivel) {
            this.combustivel = combustivel;
            return this;
        }

        public Veiculo build() {

            if (marca == null) {
                throw new IllegalStateException("Campo marca � obrigat�rio");
            }

            if (modelo == null) {
                throw new IllegalArgumentException("Campo modelo � obrigat�rio");
            }

            if (anoModelo == null) {
                throw new IllegalStateException("Campo ano modelo � obrigat�rio");
            }

            if (anoFabricacao == null) {
                throw new IllegalStateException("Campo ano fabrica��o � obrigat�rio");
            }

            if (anoModelo - anoFabricacao > 1) {
                throw new IllegalStateException("Ano do modelo n�o � v�lido para o ano de fabrica��o do autom�vel");
            }

            return new Veiculo(this);
        }
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public int getAnoModelo() {
        return anoModelo;
    }

    public int getAnoFabricacao() {
        return anoFabricacao;
    }

    public String getPlaca() {
        return placa;
    }

    public int getQuantidadePortas() {
        return quantidadePortas;
    }

    public String getCombustivel() {
        return combustivel;
    }

    @Override
    public String toString() {
        return "Veiculo [marca=" + marca + ", modelo=" + modelo + ", anoModelo=" + anoModelo + ", anoFabricacao="
                + anoFabricacao + ", placa=" + placa + ", quantidadePortas=" + quantidadePortas + ", combustivel="
                + combustivel + "]";
    }

    public static void main(String[] args) {
        Veiculo.VeiculoBuilder builder = new Veiculo.VeiculoBuilder();
        Veiculo palio = builder.marca("Fiat").modelo("P�lio")
        		.anoFabricacao(2013).anoModelo(2014).build();
        System.out.println(palio);
    }

}
