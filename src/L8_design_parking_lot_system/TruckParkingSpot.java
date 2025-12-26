package L8_design_parking_lot_system;

public class TruckParkingSpot extends ParkingSpot{

    public TruckParkingSpot(VehicleType spotType, int spotNumber) {
        super(spotType, spotNumber);
    }

    @Override
    public boolean canParkVehicle(Vehicle vehicle) {
        return "Truck".equalsIgnoreCase(String.valueOf(vehicle.vehicleType));
    }
}