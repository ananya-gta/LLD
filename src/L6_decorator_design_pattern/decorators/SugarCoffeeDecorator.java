package L6_decorator_design_pattern.decorators;

import L6_decorator_design_pattern.componentInterface.Coffee;
import L6_decorator_design_pattern.decoratorInterface.CoffeeDecorator;

public class SugarCoffeeDecorator extends CoffeeDecorator {
    public SugarCoffeeDecorator(Coffee coffee) {
        super(coffee);
    }

    @Override
    public String getDescription() {
        return coffee.getDescription() + ", Sugar";
    }

    @Override
    public double getCost() {
        return coffee.getCost() + 0.5;
    }
}
