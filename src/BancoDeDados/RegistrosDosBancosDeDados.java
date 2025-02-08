package BancoDeDados;

import Veiculos.*;

import java.util.ArrayList;
import java.util.List;


public class RegistrosDosBancosDeDados {
    static int contador = 7;

    public static List<Veiculo> registroVeiculos() {
        List<Veiculo> listaDeVeiculos = new ArrayList<>();
        listaDeVeiculos.add(new Suv(1, "Honda CRV", "ABC-2719", TipoVeiculo.SUV.getValorDaDiaria(), true, TipoVeiculo.SUV.getTipoDoVeiculo()));
        listaDeVeiculos.add(new Suv(2, "Jeep Compass", "ABC-2720", TipoVeiculo.SUV.getValorDaDiaria(), true, TipoVeiculo.SUV.getTipoDoVeiculo()));
        listaDeVeiculos.add(new Suv(3, "Hyundai Creta", "ABC-2721", TipoVeiculo.SUV.getValorDaDiaria(), true, TipoVeiculo.SUV.getTipoDoVeiculo()));
        listaDeVeiculos.add(new Suv(4, "Volkswagen Nivus", "ABC-2722", TipoVeiculo.SUV.getValorDaDiaria(), false, TipoVeiculo.SUV.getTipoDoVeiculo()));
        listaDeVeiculos.add(new Suv(5, "Chevrolet Equinox Premier", "ABC-2723", TipoVeiculo.SUV.getValorDaDiaria(), true, TipoVeiculo.SUV.getTipoDoVeiculo()));
        listaDeVeiculos.add(new Suv(6, "Toyota Corolla Cross XR", "ABC-2724", TipoVeiculo.SUV.getValorDaDiaria(), true, TipoVeiculo.SUV.getTipoDoVeiculo()));
        return listaDeVeiculos;
    }

    public static Veiculo buscarRegistroVeiculo(int codigo) {
        Veiculo veiculoEncontrado = null;

        for (Veiculo veiculoDisponivel : registroVeiculos()) {
            if (veiculoDisponivel.getCodigoVeiculo() == codigo && veiculoDisponivel.isDisponibilidade()) {
                if (veiculoDisponivel.getTipoVeiculo().equals(TipoVeiculo.CARRO_COMUM.getTipoDoVeiculo())){
                    veiculoEncontrado = new CarroComum(
                            veiculoDisponivel.getCodigoVeiculo(),
                            veiculoDisponivel.getModelo(),
                            veiculoDisponivel.getPlaca(),
                            veiculoDisponivel.getValorDaDiaria(),
                            veiculoDisponivel.isDisponibilidade(),
                            veiculoDisponivel.getTipoVeiculo()

                    );
                } else if (veiculoDisponivel.getTipoVeiculo().equals(TipoVeiculo.CARRO_PREMIUM.getTipoDoVeiculo())){
                    veiculoEncontrado = new CarroPremium(
                            veiculoDisponivel.getCodigoVeiculo(),
                            veiculoDisponivel.getModelo(),
                            veiculoDisponivel.getPlaca(),
                            veiculoDisponivel.getValorDaDiaria(),
                            veiculoDisponivel.isDisponibilidade(),
                            veiculoDisponivel.getTipoVeiculo()
                    );
                }else if (veiculoDisponivel.getTipoVeiculo().equals(TipoVeiculo.SUV.getTipoDoVeiculo())) {
                    veiculoEncontrado = new Suv(
                            veiculoDisponivel.getCodigoVeiculo(),
                            veiculoDisponivel.getModelo(),
                            veiculoDisponivel.getPlaca(),
                            veiculoDisponivel.getValorDaDiaria(),
                            veiculoDisponivel.isDisponibilidade(),
                            veiculoDisponivel.getTipoVeiculo()

                    );

                } else if (veiculoDisponivel.getTipoVeiculo().equals(TipoVeiculo.MOTO.getTipoDoVeiculo())) {
                veiculoEncontrado = new Moto(
                        veiculoDisponivel.getCodigoVeiculo(),
                        veiculoDisponivel.getModelo(),
                        veiculoDisponivel.getPlaca(),
                        veiculoDisponivel.getValorDaDiaria(),
                        veiculoDisponivel.isDisponibilidade(),
                        veiculoDisponivel.getTipoVeiculo()



                );
                }
                else{
                veiculoEncontrado = new Caminhao(
                        veiculoDisponivel.getCodigoVeiculo(),
                        veiculoDisponivel.getModelo(),
                        veiculoDisponivel.getPlaca(),
                        veiculoDisponivel.getValorDaDiaria(),
                        veiculoDisponivel.isDisponibilidade(),
                        veiculoDisponivel.getTipoVeiculo()

                );
                }

        }

    }
        return veiculoEncontrado;
    }

}
