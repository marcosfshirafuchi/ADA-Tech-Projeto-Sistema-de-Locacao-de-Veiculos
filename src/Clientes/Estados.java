package Clientes;

public enum Estados {
    ACRE (1),
    ALAGOAS (2),
    AMAPA (3),
    AMAZONAS (4),
    BAHIA (5),
    CEARA (6),
    DISTRITO_FEDERAL (7),
    ESPIRITO_SANTO (8),
    GOIAS (9),
    MARANHAO (10),
    MATO_GROSSO (11),
    MATO_GROSSO_DO_SUL (12),
    MINAS_GERAIS (13),
    PARA (14),
    PARAIBA (15),
    PARANA (16),
    PERNAMBUCO (17),
    PIAUI (18),
    RIO_DE_JANEIRO (19),
    RIO_GRANDE_DO_NORTE (20),
    RIO_GRANDE_DO_SUL (21),
    RONDONIA (22),
    RORAIMA (23),
    SANTA_CATARINA (24),
    SAO_PAULO (25),
    SERGIPE (26),
    TOCANTINS (27);


    private int codigo;
    private String sigla;

    Estados(int codigo) {
        switch (codigo){
            case 1 :
                this.sigla = "AC";
                break;
            case 2 :
                this.sigla = "AL";
                break;
            case 3 :
                this.sigla = "AP";
                break;
            case 4:
                this.sigla = "AM";
                break;
            case 5 :
                this.sigla = "BA";
                break;
            case 6 :
                this.sigla = "CE";
                break;
            case 7 :
                this.sigla = "DF";
                break;
            case 8 :
                this.sigla = "ES";
                break;
            case 9 :
                this.sigla = "GO";
                break;
            case 10 :
                this.sigla = "MA";
                break;
            case 11 :
                this.sigla = "MT";
                break;
            case 12 :
                this.sigla = "MS";
                break;
            case 13 :
                this.sigla = "MG";
                break;
            case 14 :
                this.sigla = "PA";
                break;
            case 15 :
                this.sigla = "PB";
                break;
            case 16 :
                this.sigla = "PR";
                break;
            case 17 :
                this.sigla = "PE";
                break;
            case 18 :
                this.sigla = "PI";
                break;
            case 19 :
                this.sigla = "RJ";
                break;
            case 20 :
                this.sigla = "RN";
                break;
            case 21 :
                this.sigla = "RS";
                break;
            case 22 :
                this.sigla = "RO";
                break;
            case 23 :
                this.sigla = "RR";
                break;
            case 24 :
                this.sigla = "SC";
                break;
            case 25 :
                this.sigla = "SP";
                break;
            case 26 :
                this.sigla = "SE";
                break;
            case 27 :
                this.sigla = "TO";
                break;
        }

    }

    public String getSigla() {
        return sigla;
    }
}
