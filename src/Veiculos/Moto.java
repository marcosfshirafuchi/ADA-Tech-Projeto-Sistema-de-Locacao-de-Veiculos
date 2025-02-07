package Veiculos;


public class Moto extends Veiculo {

    private boolean motoLigada;
    private Integer cilindradas;

    public Moto(int codigoVeiculo, String modelo, String placa, double valorDaDiaria, boolean disponibilidade, Integer cilindradas, boolean motoLigada) {
        super(codigoVeiculo, modelo, placa, valorDaDiaria, disponibilidade);
        this.motoLigada = motoLigada;
        this.cilindradas = cilindradas;
        System.out.printf(String.valueOf(cilindradas));
        System.out.printf(String.valueOf(this.cilindradas));
    }

    public void darPartida() {
        this.motoLigada = true;
    }

    public void setCilindradas(Integer cilindradas) {
        this.cilindradas = cilindradas;
    }

    public Integer getCilindradas(){
        return this.cilindradas;
    }
}


//Moto s20 = new Moto(500,"s20","pto",43.43,true,500,true);