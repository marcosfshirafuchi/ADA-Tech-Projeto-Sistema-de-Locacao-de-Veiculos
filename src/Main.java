import Clientes.Cliente;
import Clientes.Endereco;
import Clientes.Estados;
import Locacao.Locacao;
import Veiculo.SUV;
import Clientes.PessoaFisica;
import java.time.LocalDate;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//        System.out.print("Digite o CPF ex: 00000000000 => ");
//        String CPF = scanner.nextLine();
//        if (ValidaCPF.isCPF(CPF) == true)
//            System.out.printf("%s\n", ValidaCPF.imprimeCPF(CPF));
//        else System.out.printf("Erro, CPF invalido !!!\n");
//
//        System.out.print("Informe um CNPJ: ");
//        String CNPJ = scanner.nextLine();
//        if (ValidaCNPJ.isCNPJ(CNPJ) == true)
//            System.out.printf("%s\n", ValidaCNPJ.imprimeCNPJ(CNPJ));
//        else System.out.printf("Erro, CNPJ inválido !!!\n");

        Endereco endereco = new Endereco("02478-521","Avenida Estados Unidos","271", "AP 145","Jardim América","São Paulo", Estados.SAO_PAULO);
        Cliente cliente = new PessoaFisica("Bruno Berdinazi","10407012052",endereco,"1197413-2458");
        //System.out.println(endereco);
        LocalDate dataInicio = LocalDate.of(2025, 2, 1);
        LocalDate dataFim = LocalDate.of(2025, 2, 4);
        SUV carro = new SUV("Honda Civic", "XYZ-9876", 200.0, true);
        Locacao locacao = new Locacao(cliente,carro,dataInicio,dataFim);
        locacao.alugarVeiculo(dataInicio, dataFim);
        System.out.println(locacao);
        System.out.println("Valor a ser Pago: " + String.format("R$ %.2f", locacao.devolverVeiculo(dataInicio,dataFim)));
        scanner.close();
    }
}