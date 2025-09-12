package L4_strategy_design_pattern.with;

public class Main {
    public static void main(String []args) {
        Vehicle offRoadsVehicle = new OffRoadsVehicle();
        Vehicle sportsCarVehicle = new SportsVehicle();
        offRoadsVehicle.drive();
        sportsCarVehicle.drive();
    }
}
