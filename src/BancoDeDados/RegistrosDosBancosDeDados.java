package BancoDeDados;

import Veiculos.Suv;
import Veiculos.Veiculo;

import java.util.ArrayList;
import java.util.List;

public class RegistrosDosBancosDeDados {
    static int contador = 1;
    public static void cadastrarVeiculos(){
        List<Veiculo> listaDeVeiculos = new ArrayList<>();
        listaDeVeiculos.add(new Suv(contador,"Honda CRV",));
        contador++;
    }
}
