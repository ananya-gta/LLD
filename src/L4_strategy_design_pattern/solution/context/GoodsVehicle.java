package L4_strategy_design_pattern.solution.context;

import L4_strategy_design_pattern.solution.strategy.DriveStrategy;

public class GoodsVehicle extends Vehicle{
    public GoodsVehicle(DriveStrategy driveStrategy) {
        super(driveStrategy);
    }
}
