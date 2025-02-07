package Locacao;

import java.time.LocalDate;
import java.util.Scanner;

import static Locacao.LocacaoValidator.validarPeriodoLocacao;

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

    public static LocalDate dataAtualDeDevolucao(LocalDate dataInicio){
        Scanner scanner = new Scanner(System.in);
        String dataDevolucaoAtual = null;
        LocalDate dataFimAtual;
        do{
            System.out.print("Digite a data atual da devolução do veiculo no formato dd/mm/AAAA: ");
            dataDevolucaoAtual = scanner.nextLine();
            String[] partesAtual = dataDevolucaoAtual.split("/");
            String diaAtual = partesAtual[0];
            String mesAtual = partesAtual[1];
            String anoAtual = partesAtual[2];
            dataFimAtual = LocalDate.of(Integer.parseInt(anoAtual), Integer.parseInt(mesAtual), Integer.parseInt(diaAtual));
            if (!validarPeriodoLocacao(dataInicio, dataFimAtual)){
            System.out.println("Período de locação inválido.");
        }
        }while (!validarPeriodoLocacao(dataInicio, dataFimAtual));
        return dataFimAtual;
    }
}
