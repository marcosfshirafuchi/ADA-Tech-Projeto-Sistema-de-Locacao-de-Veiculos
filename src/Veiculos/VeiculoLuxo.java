package Veiculos;

public interface VeiculoLuxo {


    default void conectarWifi() {
        System.out.println("Wi-Fi ativado.");
    }

    default void conectarBluetooth() {
        System.out.println("Bluetooth ativado.");
    }

    default void ativarClimatizacao() {
        System.out.println("Climatização ativada.");
    }

    default void ativarAssistenteEstacionamento() {
        System.out.println("Assistente de estacionamento ativado.");
    }

    default void detectarPontosCegos() {
        System.out.println("Detecção de pontos cegos ativada.");
    }

    default void ativarTelaEntretenimento() {
        System.out.println("Tela de entretenimento ativada.");
    }


}