package Veiculos;

public class CarroPremium extends Veiculo implements VeiculoLuxo {
    private boolean massagemNoBanco;
    private boolean iluminacaoInternaPersonalizavel;
    private boolean visaoNoturna;
    private boolean pilotoAutomatico;

    public CarroPremium(int codigoVeiculo,String modelo, String placa, double valorDaDiaria, boolean disponibilidade, boolean massagemNoBanco, boolean iluminacaoInternaPersonalizavel, boolean visaoNoturna, boolean pilotoAutomatico) {
        super(codigoVeiculo,modelo, placa, valorDaDiaria, disponibilidade);
        this.massagemNoBanco = massagemNoBanco;
        this.iluminacaoInternaPersonalizavel = iluminacaoInternaPersonalizavel;
        this.visaoNoturna = visaoNoturna;
        this.pilotoAutomatico = pilotoAutomatico;
    }

    public void ativarMassagem() {
        massagemNoBanco = !massagemNoBanco;
        System.out.println("Massagem no banco " + (massagemNoBanco ? "ativada." : "desativada."));
    }

    public void alterarIluminacaoInterna() {
        iluminacaoInternaPersonalizavel = !iluminacaoInternaPersonalizavel;
        System.out.println("Iluminação interna " + (iluminacaoInternaPersonalizavel ? "ativada." : "desativada."));
    }

    public void ativarIluminacaoNoturna() {
        visaoNoturna = !visaoNoturna;
        System.out.println("Iluminação noturna " + (visaoNoturna ? "ativada." : "desativada."));
    }

    public void ativarPilotoAutomatico() {
        pilotoAutomatico = !pilotoAutomatico;
        System.out.println("Piloto automático " + (pilotoAutomatico ? "ativado." : "desativado."));
    }
}