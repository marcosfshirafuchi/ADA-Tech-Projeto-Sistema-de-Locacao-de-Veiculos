package FuncoesMain;

import Clientes.CadastrarCliente;
import Clientes.PessoaFisica;
import Clientes.PessoaJuridica;
import Locacao.Locacao;
import Veiculos.Veiculo;
import java.time.LocalDate;
import java.util.Scanner;
import static BancoDeDados.RegistrosDosBancosDeDados.buscarRegistroVeiculo;
import static BancoDeDados.RegistrosDosBancosDeDados.registroVeiculos;
import static Clientes.CadastrarCliente.cadastrarPessoaJuridica;
import static Locacao.DataDeEntrada.dataDeDEntrada;
import static Locacao.DataDevolucao.dataDeDevolucaoRegistrada;
import static Locacao.Locacao.alugarVeiculo;
import static Locacao.LocacaoValidator.validarPeriodoLocacao;
import static Relatorios.Relatorios.relatorioVeiculosAlugados;
import static Relatorios.Relatorios.relatorioVeiculosDisponiveis;

public class FuncoesMain {

    public static void escolherCadastroCliente() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Escolha a opção do cliente:");
        System.out.println("1 - Pessoa Física.");
        System.out.println("2 - Pessoa Juridica.");

        System.out.print("Digite a opção do cliente desejada: ");

        int opcaoCliente = scanner.nextInt();

        PessoaFisica pessoafisica = new PessoaFisica();
        PessoaJuridica pessoaJuridica = new PessoaJuridica();

        switch (opcaoCliente){
            case 1:
                pessoafisica = CadastrarCliente.cadastrarPessoaFisica();
                break;
            case 2:
                pessoaJuridica = cadastrarPessoaJuridica();
                break;
            default:
                System.out.println("Opção inválida.\n Digite:\n 1 - Pessoa Física.\n 2-Pessoa Jurídica.");

        }
    }

    public static void alugarCarro (){
        PessoaFisica pessoafisica = new PessoaFisica();
        PessoaJuridica pessoaJuridica = new PessoaJuridica();
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a opção do cliente desejada: ");

        int opcaoCliente = scanner.nextInt();

        LocalDate dataInicio;
        LocalDate dataFim;

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
//        switch (opcaoTipoCarro) {
//            case (1):
//                break;
//            case (2):
//                break;
//            case (3):
//                break;
//            case (4):
//                break;
//            case (5):
//                break;
//        }
//        Suv carro = new Suv(1,"Honda Civic", "XYZ-9876", 200.0, true, TipoVeiculo.SUV.getTipoDoVeiculo());

        Locacao locacao = null;
        LocalDate dataFimAtual;

        switch (opcaoCliente){
            case 1:
                locacao = new Locacao(pessoafisica,carro,dataInicio,dataFim);
                System.out.println(locacao);
                System.out.println("Valor a ser Pago: " + String.format("R$ %.2f", locacao.devolverVeiculo(dataInicio,dataFim,dataFim)));
                break;
            case 2:
                locacao = new Locacao(pessoaJuridica,carro,dataInicio,dataFim);
                System.out.println(locacao);
                System.out.println("Valor a ser Pago: " + String.format("R$ %.2f", locacao.devolverVeiculo(dataInicio,dataFim,dataFim)));
                break;
        }
        alugarVeiculo(locacao,codigoDoVeiculo);
        relatorioVeiculosAlugados(registroVeiculos());
        scanner.close();
    }

    public static void selecionarRelatorio(){
        Scanner scanner = new Scanner(System.in);

        System.out.println("1 - Lista dos veículos disponíveis. \n 2 - Lista dos veículos alugados. \n 3 - Lista dos veículos de luxo.");

        System.out.print("Selecione uma opção: ");
        int opcao = scanner.nextInt();;

        switch (opcao) {
            case 1:
                System.out.println("Veículos disponíveis:");
                relatorioVeiculosDisponiveis(registroVeiculos());
                break;
            case 2:
                System.out.println("Veículos alugados:");
                relatorioVeiculosAlugados(registroVeiculos());
                break;
            case 3:
                System.out.println("Veiculos de luxo:");
                //                    relatorioVeiculoLuxo(registroVeiculos());
        }




    }

}
