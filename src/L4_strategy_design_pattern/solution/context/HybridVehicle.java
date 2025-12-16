package L4_strategy_design_pattern.solution.context;

import L4_strategy_design_pattern.solution.strategy.DriveStrategy;

public class HybridVehicle extends Vehicle{
    public HybridVehicle(DriveStrategy driveStrategy) {
        super(driveStrategy);
    }
}
