package Veiculos;

public abstract class Veiculo {
    private String modelo;
    private String placa;
    private double valorDaDiaria;
    private boolean disponibilidade;

    public Veiculo(String modelo, String placa, double valorDaDiaria, boolean disponibilidade) {
        this.modelo = modelo;
        this.placa = placa;
        this.valorDaDiaria = valorDaDiaria;
        this.disponibilidade = disponibilidade;
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

    public void setDisponiblidade(boolean disponibilidade) {
        this.disponibilidade = disponibilidade;
    }


}
