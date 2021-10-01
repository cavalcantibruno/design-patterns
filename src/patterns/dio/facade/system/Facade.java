package patterns.dio.facade.system;

import patterns.dio.facade.subsystem.cep.SubSystemCEP;
import patterns.dio.facade.subsystem.crm.SubSystemCRM;

public class Facade {

    public void migrateClient(String nome, String cep) {
        String city = SubSystemCEP.getInstacia().getCity(cep);
        String state = SubSystemCEP.getInstacia().getState(cep);
        String street = SubSystemCEP.getInstacia().getStreet(cep);

        SubSystemCRM.saveClient(nome, cep, state, city, street);

    }
}
