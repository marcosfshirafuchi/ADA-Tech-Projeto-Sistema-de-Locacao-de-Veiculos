package Relatorios;
import java.util.List;

import Veiculos.CarroPremium;
import Veiculos.Suv;
import Veiculos.Veiculo;

public class Relatorios {

    public static void relatorioVeiculosDisponiveis(List<Veiculo> listaVeiculosDisponiveis) {
        System.out.println("Veículos disponíveis para locação: ");
        System.out.println("-------------------------------------");
        System.out.println();
        for (Veiculo veiculo : listaVeiculosDisponiveis) {
            if (veiculo.isDisponibilidade()){
                System.out.println(veiculo);
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
                System.out.println(veiculo);
                System.out.println();
            }
        }
        System.out.println("-------------------------------------");
    }

    public static void relatorioVeiculoLuxo(List<Suv> listaVeiculosSUV, List<CarroPremium> listaVeiculosPremium){
        System.out.println("Lista de veículos de luxo: Veículos Premium e SUVs.");
        System.out.println("Lista de veículos do tipo Premium: ");
        System.out.println("-------------------------------------");
        System.out.println("");
        for (CarroPremium carroPremium : listaVeiculosPremium){
            System.out.println(carroPremium);
            System.out.println();
        }

        System.out.println("-------------------------------------");
        System.out.println();
        System.out.println("Lista de veículos do tipo SUV: ");
        System.out.println("-------------------------------------");
        System.out.println("");

        for (Suv suvs : listaVeiculosSUV) {
            System.out.println(suvs);
            System.out.println();
        }

        System.out.println("-------------------------------------");

    }

}
