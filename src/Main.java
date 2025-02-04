import Cliente.ValidaCNPJ;
import Cliente.ValidaCPF;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o CPF ex: 00000000000 => ");
        String CPF = scanner.nextLine();
        if (ValidaCPF.isCPF(CPF) == true)
            System.out.printf("%s\n", ValidaCPF.imprimeCPF(CPF));
        else System.out.printf("Erro, CPF invalido !!!\n");

        System.out.print("Informe um CNPJ: ");
        String CNPJ = scanner.nextLine();
        if (ValidaCNPJ.isCNPJ(CNPJ) == true)
            System.out.printf("%s\n", ValidaCNPJ.imprimeCNPJ(CNPJ));
        else System.out.printf("Erro, CNPJ inválido !!!\n");
        scanner.close();
    }
}