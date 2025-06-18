package InterfaceSegregationPrinciple.Adheres;

public class Main {
    public static void main(String[] args) {
        Workable human = new HumanWorker();
        human.work();

        Eatable eater = new HumanWorker();
        eater.eat();

        Workable robot = new RobotWorker();
        robot.work();
        // robot does not implement Eatable, so no eat() method
    }
}

