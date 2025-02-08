package Veiculos;

public enum TipoVeiculo {
    CARRO_COMUM("Carro Comum", 100.0),
    CARRO_PREMIUM("Carro Premium", 200.0),
    SUV("SUV", 300.0),
    MOTO("Moto", 50.0),
    CAMINHAO("Caminhão", 500.0);

    private final String tipoDoVeiculo;
    private  double valorDaDiaria;

    TipoVeiculo(String tipoDoVeiculo, double valorDaDiaria) {
        this.tipoDoVeiculo = tipoDoVeiculo;
        this.valorDaDiaria = valorDaDiaria;
    }

    TipoVeiculo(String tipoDoVeiculo) {
        this.tipoDoVeiculo = tipoDoVeiculo;
    }

    public String getTipoDoVeiculo() {
        return tipoDoVeiculo;
    }

    public double getValorDaDiaria() {
        return valorDaDiaria;
    }
}
