import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o CPF ex: 00000000000 => ");
        String CPF = scanner.nextLine();
        if (ValidaCPF.isCPF(CPF) == true)
            System.out.printf("%s\n", ValidaCPF.imprimeCPF(CPF));
        else System.out.printf("Erro, CPF invalido !!!\n");
        scanner.close();
    }
}