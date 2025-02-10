
import java.util.Scanner;

import static FuncoesMain.FuncoesMain.*;


public class Main {
    /**
     * <h1> Desenvolva + | #1322 - Projeto de POO 1:
     * Sistema de Locação de Veículos </h1>
     * Descrição Geral<br><br>
     * O objetivo deste projeto é desenvolver um sistema para uma locadora de veículos,
     * aplicando os conceitos de Programação Orientada a Objetos (POO) em Java. O sistema
     * permitirá o cadastro de veículos, clientes e locações, além de oferecer serviços adicionais
     * para veículos de luxo. Praticar conceitos essenciais, como encapsulamento, herança,
     * polimorfismo e interfaces, além de dividir as responsabilidades do projeto em equipe. <br><br>
     * Requisitos Funcionais <br><br>
     *
     * O sistema deve permitir as seguintes funcionalidades:<br><br>
     *
     * Cadastro de Veículos <br><br>
     *
     * ● Os veículos podem ser de diferentes tipos, como CarroComun, CarroPremium,
     * SUV, Moto e Caminhão. <br>
     * ● Apenas Carros Premium e SUVs podem oferecer serviços de luxo (Carros Comuns
     * não podem oferecer comportamentos de serviços de luxo). <br>
     * ● Cada veículo possui:<br>
     *  ○ Modelo<br>
     * ○ Placa<br>
     * ○ Valor da diária<br>
     * ○ Disponibilidade<br><br>
     * Cadastro de Clientes <br><br>
     * ● Dois tipos de clientes: <br>
     * ○ Pessoa Física (CPF) <br>
     * ○ Pessoa Jurídica (CNPJ) <br><br>
     * ● Informações comuns: <br>
     * ○ Nome <br>
     * ○ Documento (CPF/CNPJ) <br>
     * ○ Endereço <br>
     * ○ Telefone <br><br>
     * Locação de Veículos<br><br>
     * ● Um cliente pode alugar um veículo por um período específico. <br>
     * ● O sistema deve calcular o valor total da locação com base no número de dias e na
     * tarifa diária do veículo.<br>
     * ● Deve verificar se o veículo está disponível antes de alugar. <br><br>
     * Serviços de Luxo<br><br>
     * ● Apenas veículos premium (CarroPremium e SUV) podem oferecer serviços
     * adicionais.( VeiculoLuxo -> oferecerServicoPremium() ). <br><br>
     * Relatórios e Consultas<br><br>
     * ● Listagem de veículos disponíveis. <br>
     * ● Listagem de veículos alugados. <br>
     * ● Listagem de veículos de luxo.<br>
     * <p>
     * <b>Note:</b> Desenvolvido na linguagem Java.
     *
     * @authors
     * Alan Cleber<br>
     * Bruno Ferreira<br>
     * Claudia Bispo<br>
     * Marcos Ferreira Shirafuchi<br>
     * Mattheus Tiberio Lima<br>
     * Raquel Corrêa de Souza<br>
     * @version 1.0
     * @since 09/02/2025
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("**************Sistema de Locação de Veículos**************\n");

        int opcao;
        boolean loop = true;

        while(loop) {
            System.out.println("Escolha o tipo de serviço que deseja executar: \n");

            System.out.println("1 - Cadastro de Cliente");
            System.out.println("2 - Aluguel de automóvel");
            System.out.println("3 - Consulta aos relatórios dos veículos");
            System.out.println("4 - Sair do sistema \n");

            System.out.print("Digite a opção desejada: ");
            opcao = scanner.nextInt();

            switch (opcao){
                case 1:
                    System.out.println("");
                    escolherCadastroCliente();
                    break;
                case 2:
                    alugar();
                    break;
                case 3:
                    selecionarRelatorio();
                    break;
                case 4:
                    System.out.println("Saindo do sistema.");
                    loop = false;
                    break;
                default:
                    System.out.println("Digite uma opção válida.");
                    System.out.println("------------------------------");
            }
        }
    }
}