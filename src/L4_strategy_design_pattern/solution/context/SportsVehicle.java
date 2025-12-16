package L4_strategy_design_pattern.solution.context;

import L4_strategy_design_pattern.solution.strategy.DriveStrategy;

public class SportsVehicle extends Vehicle{
    public SportsVehicle(DriveStrategy driveStrategy) {
        super(driveStrategy);
    }
}
