package L8_design_parking_lot_system;

public class BikeParkingSpot extends ParkingSpot{

    public BikeParkingSpot(VehicleType spotType, int spotNumber) {
        super(spotType, spotNumber);
    }

    @Override
    public boolean canParkVehicle(Vehicle vehicle) {
        return "Bike".equalsIgnoreCase(String.valueOf(vehicle.vehicleType));
    }
}