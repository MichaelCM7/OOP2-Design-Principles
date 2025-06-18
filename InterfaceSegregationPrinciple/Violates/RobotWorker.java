package InterfaceSegregationPrinciple.Violates;

class RobotWorker implements Worker {
    @Override
    public void work() {
        System.out.println("Robot working...");
    }

    @Override
    public void eat() {
        // Violation: Robot doesn't eat, but must implement eat()
        throw new UnsupportedOperationException("Robot doesn't eat!");
    }
}

