package FuncoesMain;

import Clientes.CadastrarCliente;
import Clientes.Cliente;
import Clientes.PessoaFisica;
import Clientes.PessoaJuridica;
import Locacao.Locacao;
import Veiculos.Veiculo;
import java.time.LocalDate;
import java.util.Objects;
import java.util.Scanner;

import static BancoDeDados.RegistrosDosBancosDeDados.*;
import static Clientes.CadastrarCliente.cadastrarPessoaJuridica;
import static Locacao.DataDeEntrada.dataDeDEntrada;
import static Locacao.DataDevolucao.dataDeDevolucaoRegistrada;
import static Locacao.Locacao.alugarVeiculo;
import static Locacao.LocacaoValidator.validarPeriodoLocacao;
import static Relatorios.Relatorios.*;

public class FuncoesMain {
    static int opcaoCliente;
    public static void escolherCadastroCliente() {

        Scanner scanner = new Scanner(System.in);
        boolean loop = true;

        while(loop) {
            System.out.println("\nEscolha a opção do cliente:\n");
            System.out.println("1 - Pessoa Física");
            System.out.println("2 - Pessoa Juridica");
            System.out.println("3 - Voltar ao Menu Principal\n");
            System.out.print("Digite a opção do cliente desejada: ");

            opcaoCliente = scanner.nextInt();

            PessoaFisica pessoafisica = new PessoaFisica();
            PessoaJuridica pessoaJuridica = new PessoaJuridica();
            switch (opcaoCliente){
                case 1:
                    System.out.print("\n");
                    pessoafisica = CadastrarCliente.cadastrarPessoaFisica();
                    registrarClientes(pessoafisica);
                    break;
                case 2:
                    System.out.print("\n");
                    pessoaJuridica = cadastrarPessoaJuridica();
                    registrarClientes(pessoaJuridica);
                    break;
                case 3:
                    System.out.println("\n------------------------------");
                    System.out.println("Voltando ao Menu Principal.");
                    System.out.println("------------------------------\n");
                    loop = false;
                    break;
                default:
                    System.out.println("\n------------------------------");
                    System.out.println("Digite uma opção válida.");
                    System.out.println("------------------------------\n");

            }
        }

    }

    public static void alugar(){
        Cliente pessoafisica = new PessoaFisica();
        Cliente pessoaJuridica = new PessoaJuridica();
        Scanner scanner = new Scanner(System.in);

        Cliente cliente = buscarRegistroCliente();
        LocalDate dataInicio;
        LocalDate dataFim;
        if (Objects.equals(cliente.getTipoDeCliente(), "Pessoa Física")){
            pessoafisica =  buscarRegistroCliente();
        }else{
            pessoaJuridica = buscarRegistroCliente();
        }

        do{
            dataInicio = dataDeDEntrada();
            dataFim = dataDeDevolucaoRegistrada();
            if (!validarPeriodoLocacao(dataInicio, dataFim)){
                System.out.println("Período de locação inválido.");
            }else{
                System.out.println("Período de locação válido.");
            }
        }while (!validarPeriodoLocacao(dataInicio, dataFim));
        relatorioVeiculosDisponiveis(registroVeiculos());
        System.out.print("Digite o código do veiculo para alugar: ");
        int codigoDoVeiculo = scanner.nextInt();

        Veiculo carro = buscarRegistroVeiculo(codigoDoVeiculo);
        Locacao locacao = null;

        if (Objects.equals(cliente.getTipoDeCliente(), "Pessoa Física")) {

            locacao = new Locacao(pessoafisica, carro, dataInicio, dataFim);
            System.out.println(locacao);
            System.out.println("Valor a ser Pago: " + String.format("R$ %.2f", locacao.devolverVeiculo(dataInicio, dataFim, dataFim)));
        }else{

            locacao = new Locacao(pessoaJuridica,carro,dataInicio,dataFim);
            System.out.println(locacao);
            System.out.println("Valor a ser Pago: " + String.format("R$ %.2f", locacao.devolverVeiculo(dataInicio,dataFim,dataFim)));

        }
        alugarVeiculo(locacao,codigoDoVeiculo);
        relatorioVeiculosAlugados(registroVeiculos());
    }

    public static void selecionarRelatorio(){
        Scanner scanner = new Scanner(System.in);

        boolean loop = true;

        while(loop) {
            System.out.println();
            System.out.println("1 - Lista dos veículos disponíveis. \n2 - Lista dos veículos alugados. \n3 - Lista dos veículos de luxo.\n");
            System.out.print("Selecione uma opção: ");
            int opcao = scanner.nextInt();
            System.out.println();

            switch (opcao) {
                case 1:
                    System.out.println("-------------------------------------");
                    relatorioVeiculosDisponiveis(registroVeiculos());
                    break;
                case 2:
                    System.out.println("-------------------------------------");
                    relatorioVeiculosAlugados(registroVeiculos());
                    break;
                case 3:
                    System.out.println("-------------------------------------");
                    relatorioVeiculoLuxo(registroVeiculos());
                    break;
                case 4:
                    System.out.println("\n-------------------------------------");
                    System.out.println("Retornando ao menu principal.");
                    System.out.println("-------------------------------------");
                    loop = false;
                    break;
                default:
                    System.out.println("\n-------------------------------------");
                    System.out.println("Digite uma opção válida.");
                    System.out.println("-------------------------------------");

            }
        }
    }
}
