package patterns.dio.strategy;

public class BehaviorNormal implements Behavior{

    @Override
    public void move() {
        System.out.println("Behavior normally...");
    }
}
