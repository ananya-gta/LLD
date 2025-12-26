package L8_design_parking_lot_system.strategy;

import L8_design_parking_lot_system.DurationType;
import L8_design_parking_lot_system.VehicleType;

public interface ParkingFeeStrategy {
    /*
     - Calculate parking fee based on vehicle type and duration
     -
     - @param vehicleType Type of vehicle being parked
     - @param duration Duration of parking (in hours or days)
     - @param durationType Type of duration (HOURS or DAYS)
     - @return Calculated parking fee
     */
    double calculateFees(VehicleType vehicleType, int duration, DurationType durationType);
}
