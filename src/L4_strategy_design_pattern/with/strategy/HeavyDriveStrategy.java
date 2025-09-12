package L4_strategy_design_pattern.with.strategy;

public class HeavyDriveStrategy implements DriverStrategy{
    @Override
    public void drive() {
        System.out.println("heavy car drive capability");
    }
}
