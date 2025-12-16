package L4_strategy_design_pattern.solution.context;

import L4_strategy_design_pattern.solution.strategy.DriveStrategy;

public class Vehicle {
    DriveStrategy driveStrategy;

    //constructor injection
    public Vehicle(DriveStrategy driveStrategy) {
        this.driveStrategy = driveStrategy;
    }

    public void drive() {
        System.out.print("\n" + this.getClass().getSimpleName() + ": ");
        driveStrategy.drive();
    }
}
