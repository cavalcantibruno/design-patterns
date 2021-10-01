package patterns.dio.facade.subsystem.crm;

public class SubSystemCRM {

    private SubSystemCRM() {
        super();
    }

    public static void saveClient(String nome, String cep, String state, String city, String street) {
        System.out.println("Client save in CRM system: " +
                "\nNome: " + nome +
                "\nCEP: " + cep +
                "\nEstado: " + state +
                "\nCidade: " + city +
                "\nRua: " + street);
    }
}
