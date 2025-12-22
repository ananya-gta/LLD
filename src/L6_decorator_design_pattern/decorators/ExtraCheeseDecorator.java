package L6_decorator_design_pattern.decorators;

import L6_decorator_design_pattern.componentInterface.Pizza;
import L6_decorator_design_pattern.decoratorInterface.PizzaDecorator;

public class ExtraCheeseDecorator extends PizzaDecorator {
    Pizza pizza;
    public ExtraCheeseDecorator(Pizza pizza) {
        this.pizza = pizza;
    }
    @Override
    public String getDescription() {
        return pizza.getDescription() + ", extra cheese";
    }

    @Override
    public double getCost() {
        return pizza.getCost() + 20.0;
    }
}
