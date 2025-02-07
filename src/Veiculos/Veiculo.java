package Veiculos;

public abstract class Veiculo {
    private int codigoVeiculo;
    private String modelo;
    private String placa;
    private double valorDaDiaria;
    private boolean disponibilidade;

    public Veiculo(int codigoVeiculo, String modelo, String placa, double valorDaDiaria, boolean disponibilidade) {
        this.codigoVeiculo = codigoVeiculo;
        this.modelo = modelo;
        this.placa = placa;
        this.valorDaDiaria = valorDaDiaria;
        this.disponibilidade = disponibilidade;
    }

    @Override
    public String toString() {
        return "Veiculo{" +
                "codigoVeiculo=" + codigoVeiculo +
                ", modelo='" + modelo + '\'' +
                ", placa='" + placa + '\'' +
                ", valorDaDiaria=" + valorDaDiaria +
                ", disponibilidade=" + disponibilidade +
                '}';
    }

    public int getCodigoVeiculo() {
        return codigoVeiculo;
    }

    public void setCodigoVeiculo(int codigoVeiculo) {
        this.codigoVeiculo = codigoVeiculo;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public double getValorDaDiaria() {
        return valorDaDiaria;
    }

    public void setValorDaDiaria(double valorDaDiaria) {
        this.valorDaDiaria = valorDaDiaria;
    }

    public boolean isDisponibilidade() {
        return disponibilidade;
    }

    public void setDisponibilidade(boolean disponibilidade) {
        this.disponibilidade = disponibilidade;
    }
}
