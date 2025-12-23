package behavioral_design_pattern.L4_strategy_design_pattern.solution.context;

import behavioral_design_pattern.L4_strategy_design_pattern.solution.strategy.DriveStrategy;

public class GoodsVehicle extends Vehicle{
    public GoodsVehicle(DriveStrategy driveStrategy) {
        super(driveStrategy);
    }
}
