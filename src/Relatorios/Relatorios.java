package Relatorios;
import java.util.List;
import Veiculos.TipoVeiculo;
import Veiculos.Veiculo;

public class Relatorios {

    public static void relatorioVeiculosDisponiveis(List<Veiculo> listaVeiculosDisponiveis) {
        System.out.println("Veículos disponíveis para locação: ");
        System.out.println("-------------------------------------");
        System.out.println();
        for (Veiculo veiculo : listaVeiculosDisponiveis) {
            if (veiculo.isDisponibilidade()){
                System.out.println("Código do veículo: "
                        + veiculo.getCodigoVeiculo() + " | Modelo: "
                        + veiculo.getModelo() + " | Placa: "
                        + veiculo.getPlaca() + " | Valor da diária: "
                        + veiculo.getValorDaDiaria() + " | Disponibilidade: "
                        + (veiculo.isDisponibilidade() ? "disponível" : "indisponível") + " | Tipo de veículo: "
                        + veiculo.getTipoVeiculo());
                System.out.println();
            }
        }
        System.out.println("-------------------------------------");
    }

    public static void relatorioVeiculosAlugados(List<Veiculo> listaVeiculosAlugados){
        System.out.println("Veículos alugados: ");
        System.out.println("-------------------------------------");
        System.out.println();
        for (Veiculo veiculo : listaVeiculosAlugados) {
            if(!veiculo.isDisponibilidade()){
                System.out.println("Código do veículo: "
                        + veiculo.getCodigoVeiculo() + " | Modelo: "
                        + veiculo.getModelo() + " | Placa: "
                        + veiculo.getPlaca() + " | Valor da diária: "
                        + veiculo.getValorDaDiaria() + " | Disponibilidade: "
                        + (veiculo.isDisponibilidade() ? "disponível" : "indisponível") + " | Tipo de veículo: "
                        + veiculo.getTipoVeiculo());
                System.out.println();
            }
        }
        System.out.println("-------------------------------------");
    }

    public static void relatorioVeiculoLuxo(List<Veiculo> listaVeiculosPremium){
        System.out.println("Lista de veículos de luxo.");
        System.out.println("-------------------------------------");
        System.out.println("Veículos do tipo Premium: \n");

        for (Veiculo veiculo : listaVeiculosPremium){
            if(veiculo.getTipoVeiculo().equals(TipoVeiculo.CARRO_PREMIUM.name())){
                System.out.println("Código do veículo: "
                        + veiculo.getCodigoVeiculo() + " | Modelo: "
                        + veiculo.getModelo() + " | Placa: "
                        + veiculo.getPlaca() + " | Valor da diária: "
                        + veiculo.getValorDaDiaria() + " | Disponibilidade: "
                        + (veiculo.isDisponibilidade() ? "disponível" : "indisponível") + " | Tipo de veículo: "
                        + veiculo.getTipoVeiculo());
                System.out.println();
            }

        }

        System.out.println("-------------------------------------");
        System.out.println("Veículos do tipo SUV: \n");

        for (Veiculo veiculo : listaVeiculosPremium) {
            if(veiculo.getTipoVeiculo().equals(TipoVeiculo.SUV.name())){
                System.out.println("Código do veículo: "
                        + veiculo.getCodigoVeiculo() + " | Modelo: "
                        + veiculo.getModelo() + " | Placa: "
                        + veiculo.getPlaca() + " | Valor da diária: "
                        + veiculo.getValorDaDiaria() + " | Disponibilidade: "
                        + (veiculo.isDisponibilidade() ? "disponível" : "indisponível") + " | Tipo de veículo: "
                        + veiculo.getTipoVeiculo());
                System.out.println();
            }

        }

        System.out.println("-------------------------------------");

    }

}
