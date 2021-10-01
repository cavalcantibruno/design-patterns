package patterns.dio.strategy;

public class BehaviorDefense implements Behavior{

    @Override
    public void move() {
        System.out.println("Behavior defensive...");
    }
}
