package creational_design_pattern.L6_factory_design_pattern.factory_method_pattern.concrete_factories;

import creational_design_pattern.L6_factory_design_pattern.factory_method_pattern.concrete_products.Bike;
import creational_design_pattern.L6_factory_design_pattern.factory_method_pattern.creator.VehicleFactory;
import creational_design_pattern.L6_factory_design_pattern.factory_method_pattern.product.Vehicle;

public class BikeFactory extends VehicleFactory {
    Vehicle createVehicle() {
        return new Bike();
    }
}