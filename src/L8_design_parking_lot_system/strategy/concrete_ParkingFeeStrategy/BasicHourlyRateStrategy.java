package L8_design_parking_lot_system.strategy.concrete_ParkingFeeStrategy;

import L8_design_parking_lot_system.DurationType;
import L8_design_parking_lot_system.strategy.ParkingFeeStrategy;
import L8_design_parking_lot_system.VehicleType;

public class BasicHourlyRateStrategy implements ParkingFeeStrategy {

    @Override
    public double calculateFees(VehicleType vehicleType, int duration, DurationType durationType) {
        return switch (vehicleType) {
            case CAR -> durationType == DurationType.HOURS ? duration * 10 : duration * 10 * 24;
            case BIKE -> durationType == DurationType.HOURS ? duration * 5 : duration * 5 * 24;
            case TRUCK -> durationType == DurationType.HOURS ? duration * 15 : duration * 15 * 24;
        };
    }
}
