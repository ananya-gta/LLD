package L8_design_parking_lot_system;

public class CarParkingSpot extends ParkingSpot{

    public CarParkingSpot(VehicleType spotType, int spotNumber) {
        super(spotType, spotNumber);
    }

    @Override
    public boolean canParkVehicle(Vehicle vehicle) {
        return "Car".equalsIgnoreCase(String.valueOf(vehicle.vehicleType));
    }
}
