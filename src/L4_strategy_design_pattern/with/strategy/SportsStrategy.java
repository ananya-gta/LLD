package L4_strategy_design_pattern.with.strategy;

public class SportsStrategy implements DriverStrategy{
    @Override
    public void drive() {
        System.out.println("sports car drive capability");
    }
}
