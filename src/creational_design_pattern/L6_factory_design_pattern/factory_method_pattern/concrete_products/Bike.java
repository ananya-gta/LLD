package creational_design_pattern.L6_factory_design_pattern.factory_method_pattern.concrete_products;

import creational_design_pattern.L6_factory_design_pattern.factory_method_pattern.product.Vehicle;

public class Bike implements Vehicle {
    public void drive() {
        System.out.println("Riding Bike");
    }
}