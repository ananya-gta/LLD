package L6_decorator_design_pattern.decorators;

import L6_decorator_design_pattern.componentInterface.Coffee;
import L6_decorator_design_pattern.decoratorInterface.Decorator;

public class MilkDecorator extends Decorator {
    public MilkDecorator(Coffee coffee) {
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
