package L4_strategy_design_pattern.with;

import L4_strategy_design_pattern.with.strategy.DriverStrategy;

public class Vehicle {
    DriverStrategy driverStrategyObj;
    // constructor injection
    public Vehicle(DriverStrategy driverStrategyObj) {
        this.driverStrategyObj = driverStrategyObj;
    }

    public void drive() {
        driverStrategyObj.drive();
    }
}
