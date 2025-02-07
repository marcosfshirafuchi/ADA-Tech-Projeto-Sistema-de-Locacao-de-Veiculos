package Locacao;

import java.time.LocalDate;

public class LocacaoValidator {
    public static boolean validarPeriodoLocacao(LocalDate dataInicio, LocalDate dataFim) {
        if (dataInicio == null || dataFim == null) {
            throw new IllegalArgumentException("As datas de início e fim não podem ser nulas.");
        }

        if (dataInicio.isAfter(dataFim)) {
            return false; // Data de início não pode ser depois da data de fim
        }

        return true; // Período válido
    }
}
