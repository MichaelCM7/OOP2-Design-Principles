package InterfaceSegregationPrinciple.Violates;

public class Main {
    public static void main(String[] args) {
        Worker human = new HumanWorker();
        human.work();
        human.eat();

        Worker robot = new RobotWorker();
        robot.work();
        // This line throws an exception at runtime
        robot.eat();
    }
}

