package Veiculos;

public class Caminhao extends Veiculo {
//    private double capacidadeCarga;
//    private int numeroEixos;

    public Caminhao(int codigoVeiculo, String modelo, String placa, double valorDaDiaria, boolean disponibilidade,String tipoVeiculo) {
        super(codigoVeiculo, modelo, placa, valorDaDiaria, disponibilidade, tipoVeiculo);
//        this.capacidadeCarga = capacidadeCarga;
//        this.numeroEixos = numeroEixos;
    }

//    public double getCapacidadeCarga() {
//        return capacidadeCarga;
//    }
//
//    public void setCapacidadeCarga(double capacidadeCarga) {
//        this.capacidadeCarga = capacidadeCarga;
//    }
//
//    public int getNumeroEixos() {
//        return numeroEixos;
//    }
//
//    public void setNumeroEixos(int numeroEixos) {
//        this.numeroEixos = numeroEixos;
//    }
}
//    @Override
//    public String toString() {
//        return "Caminhao{" +
//                "codigoVeiculo=" + getCodigoVeiculo() +
//                ", modelo='" + getModelo() + '\'' +
//                ", placa='" + getPlaca() + '\'' +
//                ", valorDaDiaria=" + getValorDaDiaria() +
//                ", disponibilidade=" + isDisponibilidade() +
//                ", capacidadeCarga=" + capacidadeCarga + " toneladas" +
//                ", numeroEixos=" + numeroEixos +
//                '}';
//    }
//
//    // Método para calcular o custo do aluguel com taxa adicional para caminhões grandes
//    public double calcularCustoAluguel(int dias) {
//        double taxaAdicional = capacidadeCarga > 10 ? 1.15 : 1.0;
//        return dias * getValorDaDiaria() * taxaAdicional;
//    }
//}
//
