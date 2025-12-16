package L4_strategy_design_pattern.solution.strategy;

public class NormalDrive implements DriveStrategy{
    @Override
    public void drive() {
        System.out.println("Driving in Normal mode");
    }
}
