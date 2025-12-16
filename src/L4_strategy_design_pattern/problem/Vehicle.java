package L4_strategy_design_pattern.problem;

public class Vehicle {

    void drive() {
        System.out.print("\n" + this.getClass().getSimpleName() + ": ");
        System.out.println("Driving Capability: Normal");
    }
}
