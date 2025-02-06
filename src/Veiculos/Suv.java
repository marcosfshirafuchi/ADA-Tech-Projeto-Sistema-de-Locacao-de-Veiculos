package Veiculos;

public class Suv extends Veiculo implements VeiculoLuxo {

    private boolean modoOffRoad;
    private boolean modoReboque;
    private boolean portaMalasEletrico;


    public Suv(String modelo, String placa, double valorDaDiaria, boolean disponibilidade, boolean modoOffRoad, boolean modoReboque, boolean portaMalasEletrico) {
        super(modelo, placa, valorDaDiaria, disponibilidade);
        this.modoOffRoad = modoOffRoad;
        this.modoReboque = modoReboque;
        this.portaMalasEletrico = portaMalasEletrico;
    }

    public void ativarModoOffRoad() {
        modoOffRoad = !modoOffRoad;
        System.out.println("Modo Off-road " + (modoOffRoad ? "ativado." : "desativado." ));
    }

    public void ativarModoReboque() {
        modoReboque = !modoReboque;
        System.out.println("Assistente de reboque " + (modoReboque ? "ativado." : "desativado."));
    }

    public void ativarPortaMalas() {
        portaMalasEletrico = !portaMalasEletrico;
        System.out.println((portaMalasEletrico ? "Abrindo " : "Fechando ") + "o porta-malas.");
    }

}

