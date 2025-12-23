package behavioral_design_pattern.L4_strategy_design_pattern.problem;

public class OffRoadsVehicle extends Vehicle{

    @Override
    public void drive() {
        System.out.print("\n" + this.getClass().getSimpleName() + ": ");
        System.out.println("Driving Capability: Sports"); // code duplication
        // As sports drive mode is not available in the parent class, we need to override it and implement
        // the specific behavior for all new vehicle types that require sports drive mode
    }

}
