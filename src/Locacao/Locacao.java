package Locacao;

import Clientes.Cliente;
import Veiculos.Veiculo;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Locacao {

    private Cliente cliente;
    private Veiculo veiculo;
    private LocalDate dataDeInicio;
    private LocalDate dataDeFim;
    private boolean isAlugado;

    public double calcularvalorTotal(long dias, long diaPassados, double multa){
        if (diaPassados == 0){
            return dias * getVeiculo().getValorDaDiaria();
        }else{
            return dias * getVeiculo().getValorDaDiaria() + diaPassados * getVeiculo().getValorDaDiaria() +(diaPassados * getVeiculo().getValorDaDiaria() * multa);
        }
    }

    public void alugarVeiculo(LocalDate dataDeInicio, LocalDate dataDeFim){
        if (isAlugado) {
            System.out.println("Carro não disponível para locação.");
        } else {
            this.dataDeInicio = dataDeInicio;
            this.dataDeFim = dataDeFim;
            this.isAlugado = true;
            System.out.println("Veículo alugado com sucesso.");
        }
    }

    public double devolverVeiculo(LocalDate dataDeFimAtual){
        LocalDate hoje = dataDeFimAtual;
        double multa = 0.0;
        long dias = ChronoUnit.DAYS.between(dataDeInicio, dataDeFim);
        long diaPassados = 0;
        if (hoje.isAfter(dataDeFim)){
            diaPassados = ChronoUnit.DAYS.between(dataDeFim, hoje);
            multa = 0.20;
        }
        isAlugado = false;
        return calcularvalorTotal(dias, diaPassados, multa);
    }

    public void verificarStatusDoVeiculo(){
        if (isAlugado) {
            System.out.println("Veículo alugado.");
        } else {
            System.out.println("Veículo disponível para locação.");
        }
    }

    public Locacao(Cliente cliente, Veiculo veiculo, LocalDate dataDeInicio, LocalDate dataDeFim) {
        this.cliente = cliente;
        this.veiculo = veiculo;
        this.dataDeInicio = dataDeInicio;
        this.dataDeFim = dataDeFim;
        this.isAlugado = false;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Veiculo getVeiculo() {
        return veiculo;
    }

    public void setVeiculo(Veiculo veiculo) {
        this.veiculo = veiculo;
    }

    public LocalDate getDataDeInicio() {
        return dataDeInicio;
    }

    public void setDataDeInicio(LocalDate dataDeInicio) {
        this.dataDeInicio = dataDeInicio;
    }

    public LocalDate getDataDeFim() {
        return dataDeFim;
    }

    public void setDataDeFim(LocalDate dataDeFim) {
        this.dataDeFim = dataDeFim;
    }

    @Override
    public String toString() {
        return "Locacao{" +
                "cliente=" + cliente +
                ", veiculo=" + veiculo +
                ", dataDeInicio=" + dataDeInicio +
                ", dataDeFim=" + dataDeFim +
                ", isAlugado=" + isAlugado +
                '}';
    }
}
