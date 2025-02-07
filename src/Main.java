import Clientes.*;
import Locacao.Locacao;
import Veiculos.Suv;

import java.time.LocalDate;
import java.util.Scanner;

import static Clientes.CadastrarCliente.cadastrarPessoaJuridica;
import static Clientes.DataDevolucao.dataAtualDeDevolucao;
import static Clientes.DataDevolucao.dataDeDevolucaoRegistrada;

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
        }
        System.out.println("Digite a data de inicio: ");
        System.out.print("Digite o dia: ");
        int dia = scanner.nextInt();
        System.out.print("Digite o mês: ");
        int mes = scanner.nextInt();
        System.out.print("Digite o ano: ");
        int ano = scanner.nextInt();
        LocalDate dataInicio = LocalDate.of(ano, mes, dia);
        LocalDate dataFim = dataDeDevolucaoRegistrada();
        Suv carro = new Suv(1,"Honda Civic", "XYZ-9876", 200.0, true, true, true,true);
        Locacao locacao = null;
        LocalDate dataFimAtual;
        switch (opcaoCliente){
            case 1:
                locacao = new Locacao(pessoafisica,carro,dataInicio,dataFim);
                dataFimAtual = dataAtualDeDevolucao();
                locacao = new Locacao(pessoafisica,carro,dataInicio,dataFimAtual);
                System.out.println(locacao);
                System.out.println("Valor a ser Pago: " + String.format("R$ %.2f", locacao.devolverVeiculo(dataFimAtual)));
                break;
            case 2:
                locacao = new Locacao(pessoaJuridica,carro,dataInicio,dataFim);
                dataFimAtual = dataAtualDeDevolucao();
                locacao = new Locacao(pessoaJuridica,carro,dataInicio,dataFimAtual);
                System.out.println(locacao);
                System.out.println("Valor a ser Pago: " + String.format("R$ %.2f", locacao.alugarVeiculo(dataInicio, dataFim);
                break;
        }
        System.out.println("Valor a ser Pago: R$ " + locacao.devolverVeiculo(dataFimAtual));
        scanner.close();
    }


}