public abstract class Veiculo {
    private String modelo;
    private String placa;
    private double valorDaDiaria;
    private boolean disponiblidade;

    public Veiculo(String modelo, String placa, double valorDaDiaria, boolean disponiblidade) {
        this.modelo = modelo;
        this.placa = placa;
        this.valorDaDiaria = valorDaDiaria;
        this.disponiblidade = disponiblidade;
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

    public boolean isDisponiblidade() {
        return disponiblidade;
    }

    public void setDisponiblidade(boolean disponiblidade) {
        this.disponiblidade = disponiblidade;
    }

    public abstract void alugarVeiculo();
    public abstract void devolverVeiculo();
    public abstract void verificarStatusDoVeiculo();
}
