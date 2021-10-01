package patterns.dio.facade.subsystem.cep;

import patterns.dio.singleton.SingletonEager;

public class SubSystemCEP {
    private static SubSystemCEP instacia = new SubSystemCEP();

    private SubSystemCEP() {
        super();
    }

    public static SubSystemCEP getInstacia() {
        return instacia;
    }

    public String getCity(String cep) {
        return "São Bernardo do Campo";
    }

    public String getState(String cep) {
        return "SP";
    }

    public String getStreet(String cep) {
        return "Av José Odorizzi";
    }
}
