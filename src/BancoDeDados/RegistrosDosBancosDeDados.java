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

        listaDeVeiculos.add(new CarroComum(7, "Gol", "ABC-2725", TipoVeiculo.CARRO_COMUM.getValorDaDiaria(), true, TipoVeiculo.CARRO_COMUM.getTipoDoVeiculo()));

        listaDeVeiculos.add(new CarroPremium(8, "BMW X1", "ABC-2726", TipoVeiculo.CARRO_PREMIUM.getValorDaDiaria(), true, TipoVeiculo.CARRO_PREMIUM.getTipoDoVeiculo()));

        listaDeVeiculos.add(new Suv(9, "Honda WR-V ", "ABC-2727", TipoVeiculo.SUV.getValorDaDiaria(), true, TipoVeiculo.SUV.getTipoDoVeiculo()));

        listaDeVeiculos.add(new Moto(10, "Yamaha Crosser 150", "ABC-2728", TipoVeiculo.MOTO.getValorDaDiaria(), true, TipoVeiculo.MOTO.getTipoDoVeiculo()));

        listaDeVeiculos.add(new Caminhao(11, "Mercedes-Benz Acello 1017", "ABC-2729", TipoVeiculo.CAMINHAO.getValorDaDiaria(), true, TipoVeiculo.CAMINHAO.getTipoDoVeiculo()));

        listaDeVeiculos.add(new CarroComum(12, "Fiat Mobi", "ABC-2730", TipoVeiculo.CARRO_COMUM.getValorDaDiaria(), false, TipoVeiculo.CARRO_COMUM.getTipoDoVeiculo()));

        listaDeVeiculos.add(new CarroComum(13, "Fiat Argo", "ABC-2731", TipoVeiculo.CARRO_COMUM.getValorDaDiaria(), true, TipoVeiculo.CARRO_COMUM.getTipoDoVeiculo()));

        listaDeVeiculos.add(new CarroComum(14, "Fiat Palio", "ABC-2732", TipoVeiculo.CARRO_COMUM.getValorDaDiaria(), false, TipoVeiculo.CARRO_COMUM.getTipoDoVeiculo()));

        listaDeVeiculos.add(new CarroComum(15, "Fiat Stylo", "ABC-2733", TipoVeiculo.CARRO_COMUM.getValorDaDiaria(), true, TipoVeiculo.CARRO_COMUM.getTipoDoVeiculo()));

        listaDeVeiculos.add(new CarroComum(16, "Fiat Uno", "ABC-2734", TipoVeiculo.CARRO_COMUM.getValorDaDiaria(), true, TipoVeiculo.CARRO_COMUM.getTipoDoVeiculo()));

        listaDeVeiculos.add(new CarroComum(17, "Fiat Doblo", "ABC-2735", TipoVeiculo.CARRO_COMUM.getValorDaDiaria(), false, TipoVeiculo.CARRO_COMUM.getTipoDoVeiculo()));

        listaDeVeiculos.add(new CarroComum(18, "Fiat Punto", "ABC-2736", TipoVeiculo.CARRO_COMUM.getValorDaDiaria(), false, TipoVeiculo.CARRO_COMUM.getTipoDoVeiculo()));

        listaDeVeiculos.add(new CarroComum(19, "Volkswagen Polo", "ABC-2737", TipoVeiculo.CARRO_COMUM.getValorDaDiaria(), true, TipoVeiculo.CARRO_COMUM.getTipoDoVeiculo()));

        listaDeVeiculos.add(new CarroComum(20, "Volkswagen Up", "ABC-2738", TipoVeiculo.CARRO_COMUM.getValorDaDiaria(), true, TipoVeiculo.CARRO_COMUM.getTipoDoVeiculo()));

        listaDeVeiculos.add(new CarroComum(21, "Volkswagen Up", "ABC-2738", TipoVeiculo.CARRO_COMUM.getValorDaDiaria(), true, TipoVeiculo.CARRO_COMUM.getTipoDoVeiculo()));

        listaDeVeiculos.add(new Caminhao(22, "Mercedes-Benz Atego 2426", "ABC-2739", TipoVeiculo.CAMINHAO.getValorDaDiaria(), true, TipoVeiculo.CAMINHAO.getTipoDoVeiculo()));

        listaDeVeiculos.add(new Caminhao(23, "Mercedes-Benz Actros 2651", "ABC-2740", TipoVeiculo.CAMINHAO.getValorDaDiaria(), false, TipoVeiculo.CAMINHAO.getTipoDoVeiculo()));

        listaDeVeiculos.add(new Caminhao(24, "Volvo FH 540", "ABC-2741", TipoVeiculo.CAMINHAO.getValorDaDiaria(), true, TipoVeiculo.CAMINHAO.getTipoDoVeiculo()));

        listaDeVeiculos.add(new Caminhao(25, "Volvo FH 540", "ABC-2742", TipoVeiculo.CAMINHAO.getValorDaDiaria(), false, TipoVeiculo.CAMINHAO.getTipoDoVeiculo()));

        listaDeVeiculos.add(new Caminhao(26, "Scania R 450", "ABC-2743", TipoVeiculo.CAMINHAO.getValorDaDiaria(), true, TipoVeiculo.CAMINHAO.getTipoDoVeiculo()));

        listaDeVeiculos.add(new Moto(27, "Honda CG 160", "ABC-2744", TipoVeiculo.MOTO.getValorDaDiaria(), false, TipoVeiculo.MOTO.getTipoDoVeiculo()));

        listaDeVeiculos.add(new Moto(28, "Honda XRE 300", "ABC-2745", TipoVeiculo.MOTO.getValorDaDiaria(), true, TipoVeiculo.MOTO.getTipoDoVeiculo()));

        listaDeVeiculos.add(new Moto(29, "Yamaha MT-03", "ABC-2746", TipoVeiculo.MOTO.getValorDaDiaria(), false, TipoVeiculo.MOTO.getTipoDoVeiculo()));

        listaDeVeiculos.add(new Moto(30, "BMW G 310 GS", "ABC-2747", TipoVeiculo.MOTO.getValorDaDiaria(), true, TipoVeiculo.MOTO.getTipoDoVeiculo()));

        listaDeVeiculos.add(new Moto(31, "Kawasaki Z400", "ABC-2748", TipoVeiculo.MOTO.getValorDaDiaria(), false, TipoVeiculo.MOTO.getTipoDoVeiculo()));

        listaDeVeiculos.add(new Moto(32, "Suzuki V-Strom 650", "ABC-2749", TipoVeiculo.MOTO.getValorDaDiaria(), true, TipoVeiculo.MOTO.getTipoDoVeiculo()));

        listaDeVeiculos.add(new CarroPremium(33, "Audi Q3", "ABC-2751", TipoVeiculo.CARRO_PREMIUM.getValorDaDiaria(), false, TipoVeiculo.CARRO_PREMIUM.getTipoDoVeiculo()));

        listaDeVeiculos.add(new CarroPremium(34, "Mercedes-Benz GLA 200", "ABC-2752", TipoVeiculo.CARRO_PREMIUM.getValorDaDiaria(), true, TipoVeiculo.CARRO_PREMIUM.getTipoDoVeiculo()));

        listaDeVeiculos.add(new CarroPremium(35, "Volvo XC60", "ABC-2753", TipoVeiculo.CARRO_PREMIUM.getValorDaDiaria(), false, TipoVeiculo.CARRO_PREMIUM.getTipoDoVeiculo()));
        listaDeVeiculos.add(new CarroPremium(36, "Lexus NX 350h", "ABC-2754", TipoVeiculo.CARRO_PREMIUM.getValorDaDiaria(), true, TipoVeiculo.CARRO_PREMIUM.getTipoDoVeiculo()));

        listaDeVeiculos.add(new CarroPremium(37, "Porsche Macan", "ABC-2755", TipoVeiculo.CARRO_PREMIUM.getValorDaDiaria(), false, TipoVeiculo.CARRO_PREMIUM.getTipoDoVeiculo()));

        listaDeVeiculos.add(new CarroPremium(38, "Jaguar F-PACE", "ABC-2756", TipoVeiculo.CARRO_PREMIUM.getValorDaDiaria(), true, TipoVeiculo.CARRO_PREMIUM.getTipoDoVeiculo()));


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
