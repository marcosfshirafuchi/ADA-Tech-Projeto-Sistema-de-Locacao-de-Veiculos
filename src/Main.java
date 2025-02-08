import Clientes.*;
import Locacao.Locacao;
import Veiculos.Suv;
import Veiculos.TipoVeiculo;

import java.time.LocalDate;
import java.util.Scanner;

import static Clientes.CadastrarCliente.cadastrarPessoaJuridica;
import static Locacao.DataDevolucao.dataAtualDeDevolucao;
import static Locacao.DataDevolucao.dataDeDevolucaoRegistrada;
import static Locacao.DataDeEntrada.dataDeDEntrada;
import static Locacao.LocacaoValidator.validarPeriodoLocacao;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("**************Sistema de Locação de Veículos**************");
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

        int dia, mes, ano = 0;

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

        Suv carro = new Suv(1,"Honda Civic", "XYZ-9876", 200.0, true, TipoVeiculo.SUV);

        Locacao locacao = null;
        LocalDate dataFimAtual;

        switch (opcaoCliente){
            case 1:
                locacao = new Locacao(pessoafisica,carro,dataInicio,dataFim);
                dataFimAtual = dataAtualDeDevolucao(dataInicio);
                locacao = new Locacao(pessoafisica,carro,dataInicio,dataFimAtual);
                System.out.println(locacao);
                System.out.println("Valor a ser Pago: " + String.format("R$ %.2f", locacao.devolverVeiculo(dataInicio,dataFim,dataFimAtual)));
                break;
            case 2:
                locacao = new Locacao(pessoaJuridica,carro,dataInicio,dataFim);
                dataFimAtual = dataAtualDeDevolucao(dataInicio);
                locacao = new Locacao(pessoaJuridica,carro,dataInicio,dataFimAtual);
                System.out.println(locacao);
                System.out.println("Valor a ser Pago: " + String.format("R$ %.2f", locacao.devolverVeiculo(dataInicio,dataFim,dataFimAtual)));
                break;
        }


        locacao.alugarVeiculo(locacao,dataInicio, dataFim);
        scanner.close();
    }
}