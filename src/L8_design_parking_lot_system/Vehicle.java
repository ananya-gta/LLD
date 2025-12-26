package L8_design_parking_lot_system;

import L8_design_parking_lot_system.strategy.ParkingFeeStrategy;

public abstract class Vehicle {
    protected String licensePlate;
    protected VehicleType vehicleType;
    protected ParkingFeeStrategy feeStrategy;

    protected Vehicle(String licensePlate,
                      VehicleType type,
                      ParkingFeeStrategy feeStrategy) {
        this.licensePlate = licensePlate;
        this.vehicleType = type;
        this.feeStrategy = feeStrategy;
    }

    public VehicleType getVehicleType() {
        return vehicleType;
    }

    public String getLicensePlate() {
        return licensePlate;
    }
}


class Car extends Vehicle {
    public Car(String licensePlate, ParkingFeeStrategy feeStrategy) {
        super(licensePlate,
                VehicleType.CAR,
                feeStrategy);
    }
}


class Bike extends Vehicle {
    public Bike(String licensePlate, ParkingFeeStrategy feeStrategy) {
        super(licensePlate,
                VehicleType.BIKE,
                feeStrategy);
    }
}

class Truck extends Vehicle {
    public Truck(String licensePlate, ParkingFeeStrategy feeStrategy) {
        super(licensePlate,
                VehicleType.TRUCK,
                feeStrategy);
    }
}


