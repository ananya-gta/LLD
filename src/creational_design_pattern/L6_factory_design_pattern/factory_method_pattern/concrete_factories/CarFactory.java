package creational_design_pattern.L6_factory_design_pattern.factory_method_pattern.concrete_factories;

import creational_design_pattern.L6_factory_design_pattern.factory_method_pattern.concrete_products.Car;
import creational_design_pattern.L6_factory_design_pattern.factory_method_pattern.creator.VehicleFactory;
import creational_design_pattern.L6_factory_design_pattern.factory_method_pattern.product.Vehicle;

public class CarFactory extends VehicleFactory {
    public Vehicle createVehicle() {
        return new Car();
    }
}
