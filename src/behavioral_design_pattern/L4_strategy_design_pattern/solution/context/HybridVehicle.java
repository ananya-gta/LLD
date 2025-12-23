package behavioral_design_pattern.L4_strategy_design_pattern.solution.context;

import behavioral_design_pattern.L4_strategy_design_pattern.solution.strategy.DriveStrategy;

public class HybridVehicle extends Vehicle{
    public HybridVehicle(DriveStrategy driveStrategy) {
        super(driveStrategy);
    }
}
