package behavioral_design_pattern.L4_strategy_design_pattern.solution.strategy;

public class EVDrive implements DriveStrategy{
    @Override
    public void drive() {
        System.out.println("Driving in EV mode");
    }
}
