package L8_design_parking_lot_system;

public abstract class ParkingSpot {
    private VehicleType spotType;
    private boolean isOccupied;
    private int spotNumber;
    private Vehicle vehicle;

    public ParkingSpot(VehicleType spotType, int spotNumber) {
        this.spotType = spotType;
        this.isOccupied = false;
        this.spotNumber = spotNumber;
    }

    public boolean isOccupied() {
        return isOccupied;
    }

    public abstract boolean canParkVehicle(Vehicle vehicle);

    public void parkVehicle(Vehicle vehicle) {
        if (isOccupied) {
            throw new IllegalStateException("Spot is already occupied.");
        }

        if (!canParkVehicle(vehicle)) {
            throw new IllegalArgumentException(
                    "This spot is not suitable for" + vehicle.vehicleType);
        }

        this.vehicle = vehicle;
        this.isOccupied = true;
    }

    public void vacate() {
        if (!isOccupied) {
            throw new IllegalStateException("Spot is already vacant.");
        }
        this.vehicle = null;
        this.isOccupied = false;
    }

    public int getSpotNumber() {
        return spotNumber;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    public VehicleType getSpotType() {
        return spotType;
    }
}
