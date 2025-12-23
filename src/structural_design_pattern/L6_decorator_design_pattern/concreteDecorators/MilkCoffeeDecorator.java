package structural_design_pattern.L6_decorator_design_pattern.concreteDecorators;

import structural_design_pattern.L6_decorator_design_pattern.componentInterface.Coffee;
import structural_design_pattern.L6_decorator_design_pattern.decoratorInterface.CoffeeDecorator;

public class MilkCoffeeDecorator extends CoffeeDecorator {
    public MilkCoffeeDecorator(Coffee coffee) {
        super(coffee);
    }

    @Override
    public String getDescription() {
        return coffee.getDescription() + ", Milk";
    }

    @Override
    public double getCost() {
        return coffee.getCost() + 10.0;
    }

}
