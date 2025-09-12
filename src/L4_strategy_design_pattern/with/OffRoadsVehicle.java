package L4_strategy_design_pattern.with;

import L4_strategy_design_pattern.with.strategy.HeavyDriveStrategy;
import L4_strategy_design_pattern.with.Vehicle;

public class OffRoadsVehicle extends Vehicle {
    public OffRoadsVehicle() {
        super(new HeavyDriveStrategy());
    }
}
