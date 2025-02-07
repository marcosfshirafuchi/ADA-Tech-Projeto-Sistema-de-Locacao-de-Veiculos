package Clientes;

import java.time.LocalDate;
import java.util.Scanner;

public class DataDevolucao {
    public static LocalDate dataDeDevolucaoRegistrada(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite a data de devolução no formato dd/mm/AAAA: ");
        String data = scanner.nextLine();
        String[] partes = data.split("/");
        String dia = partes[0];
        String mes = partes[1];
        String ano = partes[2];
        LocalDate dataFim = LocalDate.of(Integer.parseInt(ano), Integer.parseInt(mes), Integer.parseInt(dia));
        return dataFim;
    }

    public static LocalDate dataAtualDeDevolucao(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite a data atual da devolução do veiculo no formato dd/mm/AAAA: ");
        String dataDevolucaoAtual = scanner.nextLine();
        String[] partesAtual = dataDevolucaoAtual.split("/");
        String diaAtual = partesAtual[0];
        String mesAtual = partesAtual[1];
        String anoAtual = partesAtual[2];
        LocalDate dataFimAtual = LocalDate.of(Integer.parseInt(anoAtual), Integer.parseInt(mesAtual), Integer.parseInt(diaAtual));
        return dataFimAtual;
    }
}
