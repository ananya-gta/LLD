package L8_design_parking_lot_system;

import java.util.List;

/* ParkingLot manage parking slots and vehicle allocations
Is responsible for:
- allocating and releasing parking slots
- tracking occupied and free slots

Singleton pattern - ensuring only one instance of parking lot exists at a time
*/
public class ParkingLotManager {
    List<ParkingSpot> parkingSpots;

    public ParkingLotManager(List<ParkingSpot> parkingSpots) {
        this.parkingSpots = parkingSpots;
    }

    public ParkingSpot findAvailableSpot(Vehicle vehicle) {
        for (ParkingSpot spot : parkingSpots) {
            if (!spot.isOccupied() && spot.canParkVehicle(vehicle)) {
                return spot;
            }
        }
        return null; // No available spot found
    }

    public ParkingSpot parkVehicle(Vehicle vehicle) {
        ParkingSpot spot = findAvailableSpot(vehicle);
        if (spot != null) {
            spot.parkVehicle(vehicle);
            return spot;
        } else {
            throw new IllegalStateException("No available parking spot for vehicle type: " + vehicle.vehicleType);
        }
    }

    public void vacateSpot(ParkingSpot spot, Vehicle vehicle) {
        if (spot != null && spot.isOccupied()
                && spot.getVehicle().equals(vehicle)) {
            spot.vacate(); // Free the spot
            System.out.println(vehicle.vehicleType
                    + " vacated the spot: " + spot.getSpotNumber());
        } else {
            System.out.println("Invalid operation! Either the spot is already vacant "
                    + "or the vehicle does not match.");
        }
    }

    public ParkingSpot getSpotByNumber(int spotNumber) {
        for (ParkingSpot spot : parkingSpots) {
            if (spot.getSpotNumber() == spotNumber) {
                return spot;
            }
        }
        return null; // Spot not found
    }

    public List<ParkingSpot> getParkingSpots() {
        return parkingSpots;
    }
}
