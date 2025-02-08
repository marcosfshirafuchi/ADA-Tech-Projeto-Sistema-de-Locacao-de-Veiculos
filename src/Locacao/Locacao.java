package Locacao;

import Clientes.Cliente;
import Veiculos.Veiculo;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

import static BancoDeDados.RegistrosDosBancosDeDados.registroVeiculos;

public class Locacao {

    private Cliente cliente;
    private Veiculo veiculo;
    private LocalDate dataDeInicio;
    private LocalDate dataDeFim;

    public double calcularvalorTotal(long dias, long diaPassados, double multa){
//        if (diaPassados == 0){
            return dias * getVeiculo().getValorDaDiaria();
//        }else{
//            return dias * getVeiculo().getValorDaDiaria() + diaPassados * getVeiculo().getValorDaDiaria() +(diaPassados * getVeiculo().getValorDaDiaria() * multa);
//        }

    }


    public static void alugarVeiculo(Locacao locacao, int codigo){
        if(verificarStatusDoVeiculo(codigo)){
            locacao.veiculo.setDisponibilidade(false);
        }
    }

    public double devolverVeiculo(LocalDate dataDeInicio, LocalDate dataDeFim, LocalDate dataDeFimAtual){
        LocalDate hoje = dataDeFimAtual;
        double multa = 0.0;
        long dias = 0;
        long diaPassados = 0;
        if (hoje.isAfter(dataDeFim)){
            diaPassados = ChronoUnit.DAYS.between(dataDeFim, hoje);
            multa = 0.20;
            dias = ChronoUnit.DAYS.between(dataDeInicio, dataDeFim);
            return calcularvalorTotal(dias,diaPassados,multa);
        }
        else {
            dias = ChronoUnit.DAYS.between(dataDeInicio, dataDeFim);
            return calcularvalorTotal(dias,diaPassados,multa);
        }
    }



    public static boolean verificarStatusDoVeiculo(int codigo){
        //List<Veiculo> listaDeVeiculos = new ArrayList<>();
        for (Veiculo veiculoDisponivel: registroVeiculos()){
            if (veiculoDisponivel.getCodigoVeiculo() == codigo && veiculoDisponivel.isDisponibilidade()){
                //System.out.println("Veiculo do código "+ codigo +": disponível!");
                return true;
            }
        }
        return false;
    }

    public Locacao(Cliente cliente, Veiculo veiculo, LocalDate dataDeInicio, LocalDate dataDeFim) {
        this.cliente = cliente;
        this.veiculo = veiculo;
        this.dataDeInicio = dataDeInicio;
        this.dataDeFim = dataDeFim;
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
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        return "Locacao{" +
                "cliente=" + cliente +
                ", veiculo=" + veiculo +
                ", dataDeInicio=" + dataDeInicio.format(formatter) +
                ", dataDeFim=" + dataDeFim.format(formatter) +
                '}';
    }
}
