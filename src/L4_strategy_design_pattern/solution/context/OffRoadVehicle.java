package L4_strategy_design_pattern.solution.context;

import L4_strategy_design_pattern.solution.strategy.DriveStrategy;

public class OffRoadVehicle extends Vehicle{
    public OffRoadVehicle(DriveStrategy driveStrategy) {
        super(driveStrategy);
    }
}
