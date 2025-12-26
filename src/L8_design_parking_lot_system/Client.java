package L8_design_parking_lot_system;

import L8_design_parking_lot_system.strategy.ParkingFeeStrategy;
import L8_design_parking_lot_system.strategy.PaymentStrategy;
import L8_design_parking_lot_system.strategy.concrete_ParkingFeeStrategy.BasicHourlyRateStrategy;
import L8_design_parking_lot_system.strategy.concrete_ParkingFeeStrategy.PremiumRateStrategy;
import L8_design_parking_lot_system.strategy.concrete_PaymentStrategy.CardPaymentStrategy;
import L8_design_parking_lot_system.strategy.concrete_PaymentStrategy.CashPaymentStrategy;
import L8_design_parking_lot_system.strategy.concrete_PaymentStrategy.UPIPaymentStrategy;

import java.util.*;

public class Client {
    public static void main(String[] args) {
        List<ParkingSpot> parkingSpots = new ArrayList<>();
        parkingSpots.add(new BikeParkingSpot(VehicleType.BIKE, 1));
        parkingSpots.add(new BikeParkingSpot(VehicleType.BIKE, 7));
        parkingSpots.add(new BikeParkingSpot(VehicleType.BIKE,  8));
        parkingSpots.add(new CarParkingSpot(VehicleType.CAR, 2));
        parkingSpots.add(new TruckParkingSpot(VehicleType.TRUCK, 3));
        parkingSpots.add(new TruckParkingSpot(VehicleType.TRUCK, 6));
        parkingSpots.add(new CarParkingSpot(VehicleType.CAR, 4));
        parkingSpots.add(new CarParkingSpot(VehicleType.CAR, 5));

        ParkingLotManager parkingLot = new ParkingLotManager(parkingSpots);

        ParkingFeeStrategy basicFeeStrategy = new BasicHourlyRateStrategy();
        ParkingFeeStrategy premiumFeeStrategy = new PremiumRateStrategy();

        Vehicle bike1 = new Bike("KA-01-AB-1234", basicFeeStrategy);
        Vehicle car1 = new Car("KA-02-CD-5678", premiumFeeStrategy);
        Vehicle truck1 = new Truck("KA-03-EF-9012", basicFeeStrategy);
        Vehicle bike2 = new Bike("KA-04-GH-3456", basicFeeStrategy);
        Vehicle car2 = new Car("KA-05-IJ-7890", basicFeeStrategy);
        Vehicle truck2 = new Truck("KA-06-KL-1122", premiumFeeStrategy);

        ParkingSpot carSpot = parkingLot.parkVehicle(car1);
        ParkingSpot bikeSpot = parkingLot.parkVehicle(bike1);

        Scanner scanner = new Scanner(System.in);
        System.out.println("Select payment method for your vehicle:");
        System.out.println("1. Credit Card");
        System.out.println("2. Cash");
        System.out.println("3. UPI");
        int paymentMethod = scanner.nextInt();

        if (carSpot != null) {
            double carFee = car1.feeStrategy.calculateFees(car1.getVehicleType(), 2, DurationType.HOURS);
            System.out.println("Parking fee for Car with license plate: " + car1.getLicensePlate() + " is: " + carFee);
            PaymentStrategy carPaymentStrategy = getPaymentStrategy(paymentMethod);
            carPaymentStrategy.processPayment(carFee);
            parkingLot.vacateSpot(carSpot, car1);
        } else {
            System.out.println("No parking spot available for Car.");
        }

        if (bikeSpot != null) {
            double bikeFee = bike1.feeStrategy.calculateFees(car1.getVehicleType(), 2, DurationType.HOURS);
            System.out.println("Parking fee for Car with license plate: " + bike1.getLicensePlate() + " is: " + bikeFee);
            PaymentStrategy bikePaymentStrategy = getPaymentStrategy(paymentMethod);
            bikePaymentStrategy.processPayment(bikeFee);
            parkingLot.vacateSpot(bikeSpot, bike1);
        } else {
            System.out.println("No parking spot available for bike.");
        }

        scanner.close();
    }

    private static PaymentStrategy getPaymentStrategy(
            int paymentMethod) {
        return switch (paymentMethod) {
            case 1 -> new CardPaymentStrategy();
            case 2 -> new CashPaymentStrategy();
            case 3 -> new UPIPaymentStrategy();
            default -> {
                System.out.println("Invalid choice! Default to Credit card payment.");
                yield new CashPaymentStrategy();
            }
        };
    }
}
