
import java.util.Scanner;

import static FuncoesMain.FuncoesMain.*;


public class Main {
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