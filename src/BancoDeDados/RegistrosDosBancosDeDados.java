package BancoDeDados;

import Clientes.Cliente;
import Clientes.PessoaFisica;
import Clientes.PessoaJuridica;
import Veiculos.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class RegistrosDosBancosDeDados {


    static List<Cliente> listaDeClientes = new ArrayList<>();

    public static List<Veiculo> registroVeiculos() {
        List<Veiculo> listaDeVeiculos = new ArrayList<>();
        listaDeVeiculos.add(new Suv(1, "Honda CRV", "ABC-2719", TipoVeiculo.SUV.getValorDaDiaria(), true, TipoVeiculo.SUV.getTipoDoVeiculo()));
        listaDeVeiculos.add(new Suv(2, "Jeep Compass", "ABC-2720", TipoVeiculo.SUV.getValorDaDiaria(), true, TipoVeiculo.SUV.getTipoDoVeiculo()));
        listaDeVeiculos.add(new Suv(3, "Hyundai Creta", "ABC-2721", TipoVeiculo.SUV.getValorDaDiaria(), true, TipoVeiculo.SUV.getTipoDoVeiculo()));
        listaDeVeiculos.add(new Suv(4, "Volkswagen Nivus", "ABC-2722", TipoVeiculo.SUV.getValorDaDiaria(), false, TipoVeiculo.SUV.getTipoDoVeiculo()));
        listaDeVeiculos.add(new Suv(5, "Chevrolet Equinox Premier", "ABC-2723", TipoVeiculo.SUV.getValorDaDiaria(), true, TipoVeiculo.SUV.getTipoDoVeiculo()));
        listaDeVeiculos.add(new Suv(6, "Toyota Corolla Cross XR", "ABC-2724", TipoVeiculo.SUV.getValorDaDiaria(), true, TipoVeiculo.SUV.getTipoDoVeiculo()));

        //Exemplo de Carro Comum
        listaDeVeiculos.add(new CarroComum(7, "Gol", "ABC-2725", TipoVeiculo.CARRO_COMUM.getValorDaDiaria(), true, TipoVeiculo.CARRO_COMUM.getTipoDoVeiculo()));

        //Exemplo de Carro Premiun
        listaDeVeiculos.add(new CarroComum(8, "BMW X1", "ABC-2726", TipoVeiculo.CARRO_PREMIUM.getValorDaDiaria(), true, TipoVeiculo.CARRO_PREMIUM.getTipoDoVeiculo()));

        //Exemplo de SUV
        listaDeVeiculos.add(new Suv(9, "Honda WR-V ", "ABC-2727", TipoVeiculo.SUV.getValorDaDiaria(), true, TipoVeiculo.SUV.getTipoDoVeiculo()));

        //Exemplo de Moto
        listaDeVeiculos.add(new Moto(10, "Yamaha Crosser 150", "ABC-2728", TipoVeiculo.MOTO.getValorDaDiaria(), true, TipoVeiculo.MOTO.getTipoDoVeiculo()));

        //Exemplo de Caminhão
        listaDeVeiculos.add(new Caminhao(11, "Mercedes-Benz Acello 1017", "ABC-2729", TipoVeiculo.CAMINHAO.getValorDaDiaria(), true, TipoVeiculo.CAMINHAO.getTipoDoVeiculo()));

        return listaDeVeiculos;
    }

    public static Veiculo buscarRegistroVeiculo(int codigo) {
        Veiculo veiculoEncontrado = null;

        for (Veiculo veiculoDisponivel : registroVeiculos()) {
            if (veiculoDisponivel.getCodigoVeiculo() == codigo && veiculoDisponivel.isDisponibilidade()) {
                if (veiculoDisponivel.getTipoVeiculo().equals(TipoVeiculo.CARRO_COMUM.getTipoDoVeiculo())) {
                    veiculoEncontrado = new CarroComum(
                            veiculoDisponivel.getCodigoVeiculo(),
                            veiculoDisponivel.getModelo(),
                            veiculoDisponivel.getPlaca(),
                            veiculoDisponivel.getValorDaDiaria(),
                            veiculoDisponivel.isDisponibilidade(),
                            veiculoDisponivel.getTipoVeiculo()

                    );
                } else if (veiculoDisponivel.getTipoVeiculo().equals(TipoVeiculo.CARRO_PREMIUM.getTipoDoVeiculo())) {
                    veiculoEncontrado = new CarroPremium(
                            veiculoDisponivel.getCodigoVeiculo(),
                            veiculoDisponivel.getModelo(),
                            veiculoDisponivel.getPlaca(),
                            veiculoDisponivel.getValorDaDiaria(),
                            veiculoDisponivel.isDisponibilidade(),
                            veiculoDisponivel.getTipoVeiculo()
                    );
                } else if (veiculoDisponivel.getTipoVeiculo().equals(TipoVeiculo.SUV.getTipoDoVeiculo())) {
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
                } else {
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

    public static List<Cliente> registrarClientes(Cliente cliente) {
        listaDeClientes.add(cliente);
        return listaDeClientes;
    }

    public static Cliente buscarRegistroCliente() {
        Cliente clienteEncontrado = null;
        for (Cliente clienteDisponivel : listaDeClientes) {

            if (Objects.equals(clienteDisponivel.getTipoDeCliente(), "Pessoa Física")) {
                clienteEncontrado = new PessoaFisica(
                        clienteDisponivel.getNome(),
                        clienteDisponivel.getDocumento(),
                        clienteDisponivel.getEndereco(),
                        clienteDisponivel.getTelefone(),
                        clienteDisponivel.getTipoDeCliente()
                );
            } else {
                clienteEncontrado = new PessoaJuridica(
                        clienteDisponivel.getNome(),
                        clienteDisponivel.getDocumento(),
                        clienteDisponivel.getEndereco(),
                        clienteDisponivel.getTelefone(),
                        clienteDisponivel.getTipoDeCliente());
            }

        }
        return clienteEncontrado;
    }
}
