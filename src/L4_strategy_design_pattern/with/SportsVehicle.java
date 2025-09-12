package L4_strategy_design_pattern.with;

import L4_strategy_design_pattern.with.strategy.SportsStrategy;

public class SportsVehicle extends Vehicle{
    SportsVehicle() {
        super(new SportsStrategy());
    }
}
