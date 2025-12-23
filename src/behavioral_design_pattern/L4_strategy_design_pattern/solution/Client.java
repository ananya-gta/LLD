package behavioral_design_pattern.L4_strategy_design_pattern.solution;

import behavioral_design_pattern.L4_strategy_design_pattern.solution.context.GoodsVehicle;
import behavioral_design_pattern.L4_strategy_design_pattern.solution.context.HybridVehicle;
import behavioral_design_pattern.L4_strategy_design_pattern.solution.context.SportsVehicle;
import behavioral_design_pattern.L4_strategy_design_pattern.solution.context.Vehicle;
import behavioral_design_pattern.L4_strategy_design_pattern.solution.strategy.EVDrive;
import behavioral_design_pattern.L4_strategy_design_pattern.solution.strategy.NormalDrive;
import behavioral_design_pattern.L4_strategy_design_pattern.solution.strategy.SportsDrive;

public class Client {
    public static void main(String[] args) {
        // The main method can be used to test the vehicle strategies
        Vehicle vehicle = new SportsVehicle(new SportsDrive());
        vehicle.drive();
        vehicle = new GoodsVehicle(new NormalDrive());
        vehicle.drive();

        vehicle = new HybridVehicle(new EVDrive());
        vehicle.drive();

        vehicle = new GoodsVehicle(new NormalDrive());
        vehicle.drive();
    }
}
