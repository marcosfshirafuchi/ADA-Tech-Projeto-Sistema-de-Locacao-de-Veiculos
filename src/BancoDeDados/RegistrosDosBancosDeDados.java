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
}

public static List<Veiculo> registroCarrosComuns() {
    List<Veiculo> listaDeCarrosComuns = new ArrayList<>();
    listaDeCarrosComuns.add(new CarroComum(7, "Fiat Argo", "DEF-1234", TipoVeiculo.CARRO_COMUM.getValorDaDiaria(), true, TipoVeiculo.CARRO_COMUM.getTipoDoVeiculo()));
    listaDeCarrosComuns.add(new CarroComum(8, "Volkswagen Gol", "GHI-5678", TipoVeiculo.CARRO_COMUM.getValorDaDiaria(), true, TipoVeiculo.CARRO_COMUM.getTipoDoVeiculo()));
    return listaDeCarrosComuns;
}

public static List<Veiculo> registroCarrosPremium() {
    List<Veiculo> listaDeCarrosPremium = new ArrayList<>();
    listaDeCarrosPremium.add(new CarroPremium(9, "BMW Série 3", "JKL-9012", TipoVeiculo.CARRO_PREMIUM.getValorDaDiaria(), true, TipoVeiculo.CARRO_PREMIUM.getTipoDoVeiculo()));
    listaDeCarrosPremium.add(new CarroPremium(10, "Audi A4", "MNO-3456", TipoVeiculo.CARRO_PREMIUM.getValorDaDiaria(), true, TipoVeiculo.CARRO_PREMIUM.getTipoDoVeiculo()));
    return listaDeCarrosPremium;
}

public static List<Veiculo> registroMotos() {
    List<Veiculo> listaDeMotos = new ArrayList<>();
    listaDeMotos.add(new Moto(11, "Honda CB 500", "PQR-7890", TipoVeiculo.MOTO.getValorDaDiaria(), true, TipoVeiculo.MOTO.getTipoDoVeiculo()));
    listaDeMotos.add(new Moto(12, "Yamaha MT-03", "STU-1122", TipoVeiculo.MOTO.getValorDaDiaria(), true, TipoVeiculo.MOTO.getTipoDoVeiculo()));
    return listaDeMotos;
}

public static List<Veiculo> registroCaminhoes() {
    List<Veiculo> listaDeCaminhoes = new ArrayList<>();
    listaDeCaminhoes.add(new Caminhao(13, "Volvo FH", "VWX-3344", TipoVeiculo.CAMINHAO.getValorDaDiaria(), true, TipoVeiculo.CAMINHAO.getTipoDoVeiculo()));
    listaDeCaminhoes.add(new Caminhao(14, "Mercedes-Benz Actros", "YZA-5566", TipoVeiculo.CAMINHAO.getValorDaDiaria(), true, TipoVeiculo.CAMINHAO.getTipoDoVeiculo()));
    return listaDeCaminhoes;
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






