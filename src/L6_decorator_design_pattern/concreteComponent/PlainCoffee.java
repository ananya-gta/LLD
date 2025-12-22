package L6_decorator_design_pattern.concreteComponent;

import L6_decorator_design_pattern.componentInterface.Coffee;

public class PlainCoffee implements Coffee {

    @Override
    public String getDescription() {
        return "Plain Coffee";
    }

    @Override
    public double getCost() {
        return 10.0;
    }
}
