package creational_design_pattern.L6_factory_design_pattern.factory_method_pattern;

import creational_design_pattern.L6_factory_design_pattern.factory_method_pattern.concrete_factories.CarFactory;
import creational_design_pattern.L6_factory_design_pattern.factory_method_pattern.creator.VehicleFactory;
import creational_design_pattern.L6_factory_design_pattern.factory_method_pattern.product.Vehicle;

public class Client {
    public static void main(String[] args) {
        VehicleFactory factory = new CarFactory();
        Vehicle vehicle = factory.createVehicle();
        vehicle.drive();
    }
}
