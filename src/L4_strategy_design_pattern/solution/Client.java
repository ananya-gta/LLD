package L4_strategy_design_pattern.solution;

import L4_strategy_design_pattern.solution.context.GoodsVehicle;
import L4_strategy_design_pattern.solution.context.HybridVehicle;
import L4_strategy_design_pattern.solution.context.SportsVehicle;
import L4_strategy_design_pattern.solution.context.Vehicle;
import L4_strategy_design_pattern.solution.strategy.EVDrive;
import L4_strategy_design_pattern.solution.strategy.NormalDrive;
import L4_strategy_design_pattern.solution.strategy.SportsDrive;

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
