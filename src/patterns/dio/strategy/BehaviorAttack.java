package patterns.dio.strategy;

public class BehaviorAttack implements Behavior{

    @Override
    public void move() {
        System.out.println("Behavior attack...");
    }
}
