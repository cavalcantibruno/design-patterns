package patterns.dio.strategy;

public class StrategyTest {
    public static void main(String[] args) {

        Behavior offensive = new BehaviorAttack();
        Behavior defensive = new BehaviorDefense();
        Behavior normal = new BehaviorNormal();

        Robot robot = new Robot();
        robot.setStrategy(normal);
        robot.move();
        robot.move();

        robot.setStrategy(defensive);
        robot.move();

        robot.setStrategy(offensive);
        robot.move();
        robot.move();
        robot.move();

    }
}
