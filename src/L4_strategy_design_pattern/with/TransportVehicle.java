package L4_strategy_design_pattern.with;

import L4_strategy_design_pattern.with.Vehicle;
import L4_strategy_design_pattern.with.strategy.HeavyDriveStrategy;

public class TransportVehicle extends Vehicle {
    TransportVehicle() {
        super(new HeavyDriveStrategy());
    }
}
