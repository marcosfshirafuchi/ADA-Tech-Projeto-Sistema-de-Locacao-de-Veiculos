package Veiculos;

public class CarroComum extends Veiculo {
    private String tipoCombustivel;

    public CarroComum(int codigoVeiculo, String modelo, String placa, double valorDaDiaria, boolean disponibilidade,TipoVeiculo tipoVeiculo, String tipoCombustivel) {
        super(codigoVeiculo, modelo, placa, valorDaDiaria, disponibilidade,tipoVeiculo);
        this.tipoCombustivel = tipoCombustivel;
    }

    public String getTipoCombustivel() {
        return tipoCombustivel;
    }

    public void setTipoCombustivel(String tipoCombustivel) {
        this.tipoCombustivel = tipoCombustivel;
    }

//    @Override
//    public String toString() {
//        return "CarroComum{" +
//                "codigoVeiculo=" + getCodigoVeiculo() +
//                ", modelo='" + getModelo() + '\'' +
//                ", placa='" + getPlaca() + '\'' +
//                ", valorDaDiaria=" + getValorDaDiaria() +
//                ", disponibilidade=" + isDisponibilidade() +
//                ", tipoCombustivel='" + tipoCombustivel + '\'' +
//                '}';
//    }
//
//
//    public double calcularCustoAluguel(int dias) {
//        return dias * getValorDaDiaria();
//    }
}
