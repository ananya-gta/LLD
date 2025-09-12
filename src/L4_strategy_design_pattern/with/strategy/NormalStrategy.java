package L4_strategy_design_pattern.with.strategy;

public class NormalStrategy implements DriverStrategy{
    @Override
    public void drive() {
        System.out.println("normal drive capability");
    }
}
