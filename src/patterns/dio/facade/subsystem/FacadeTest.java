package patterns.dio.facade.subsystem;

import patterns.dio.facade.system.Facade;

public class FacadeTest {
    public static void main(String[] args) {
        Facade facade = new Facade();
        facade.migrateClient("Bruno", "09861001");
    }
}
