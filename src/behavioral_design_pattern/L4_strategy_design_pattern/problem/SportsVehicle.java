package behavioral_design_pattern.L4_strategy_design_pattern.problem;

public class SportsVehicle extends Vehicle{
    @Override
    void drive() {
        System.out.print("\n" + this.getClass().getSimpleName() + ": ");
        System.out.println("Driving Capability: Sports");
    }
}
