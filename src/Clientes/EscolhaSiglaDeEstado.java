package Clientes;

public class EscolhaSiglaDeEstado {
    public static void imprimirSiglaDosEstadosBrasileiros(){
        System.out.println("\n1 - Acre (AC)\n" +
                "2 - Alagoas (AL)\n" +
                "3 - Amapá (AP)\n" +
                "4 - Amazonas (AM)\n" +
                "5 - Bahia (BA)\n" +
                "6 - Ceará (CE)\n" +
                "7 - Distrito Federal (DF)\n" +
                "8 - Espírito Santo (ES)\n" +
                "9 - Goiás (GO)\n" +
                "10 - Maranhão (MA)\n" +
                "11 - Mato Grosso (MT)\n" +
                "12 - Mato Grosso do Sul (MS)\n" +
                "13 - Minas Gerais (MG)\n" +
                "14 - Pará (PA)\n" +
                "15 - Paraíba (PB)\n" +
                "16 - Paraná (PR)\n" +
                "17 - Pernambuco (PE)\n" +
                "18 - Piauí (PI)\n" +
                "19 - Rio de Janeiro (RJ)\n" +
                "20 - Rio Grande do Norte (RN)\n" +
                "21 - Rio Grande do Sul (RS)\n" +
                "22 - Rondônia (RO)\n" +
                "23 - Roraima (RR)\n" +
                "24 - Santa Catarina (SC)\n" +
                "25 - São Paulo (SP)\n" +
                "26 - Sergipe (SE)\n" +
                "27 - Tocantins (TO)");
    }

    public static EstadoBrasil buscarEstadoBrasileiroEscolhido(int codigo){
        EstadoBrasil estado = null;
        switch (codigo){
            case 1 :
                estado = EstadoBrasil.ACRE;
                break;
            case 2 :
                estado = EstadoBrasil.ALAGOAS;
                break;
            case 3 :
                estado = EstadoBrasil.AMAPA;
                break;
            case 4:
                estado = EstadoBrasil.AMAZONAS;
                break;
            case 5 :
                estado = EstadoBrasil.BAHIA;
                break;
            case 6 :
                estado = EstadoBrasil.CEARA;
                break;
            case 7 :
                estado = EstadoBrasil.DISTRITO_FEDERAL;
                break;
            case 8 :
                estado = EstadoBrasil.ESPIRITO_SANTO;
                break;
            case 9 :
                estado = EstadoBrasil.GOIAS;
                break;
            case 10 :
                estado = EstadoBrasil.MARANHAO;
                break;
            case 11 :
                estado = EstadoBrasil.MATO_GROSSO;
                break;
            case 12 :
                estado = EstadoBrasil.MATO_GROSSO_DO_SUL;
                break;
            case 13 :
                estado = EstadoBrasil.MINAS_GERAIS;
                break;
            case 14 :
                estado = EstadoBrasil.PARA;
                break;
            case 15 :
                estado = EstadoBrasil.PARAIBA;
                break;
            case 16 :
                estado = EstadoBrasil.PARANA;
                break;
            case 17 :
                estado = EstadoBrasil.PERNAMBUCO;
                break;
            case 18 :
                estado = EstadoBrasil.PIAUI;
                break;
            case 19 :
                estado = EstadoBrasil.RIO_DE_JANEIRO;
                break;
            case 20 :
                estado = EstadoBrasil.RIO_GRANDE_DO_NORTE;
                break;
            case 21 :
                estado = EstadoBrasil.RIO_GRANDE_DO_SUL;
                break;
            case 22 :
                estado = EstadoBrasil.RONDONIA;
                break;
            case 23 :
                estado = EstadoBrasil.RORAIMA;
                break;
            case 24 :
                estado = EstadoBrasil.SANTA_CATARINA;
                break;
            case 25 :
                estado = EstadoBrasil.SAO_PAULO;
                break;
            case 26 :
                estado = EstadoBrasil.SERGIPE;
                break;
            case 27 :
                estado = EstadoBrasil.TOCANTINS;
                break;
        }
        return estado;
    }
}
