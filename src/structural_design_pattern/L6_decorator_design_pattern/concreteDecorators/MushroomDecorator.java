package structural_design_pattern.L6_decorator_design_pattern.concreteDecorators;

import structural_design_pattern.L6_decorator_design_pattern.componentInterface.Pizza;
import structural_design_pattern.L6_decorator_design_pattern.decoratorInterface.PizzaDecorator;

public class MushroomDecorator extends PizzaDecorator {
    Pizza pizza;
    public MushroomDecorator(Pizza pizza) {
        this.pizza = pizza;
    }
    @Override
    public String getDescription() {
        return pizza.getDescription() + ", mushroom";
    }

    @Override
    public double getCost() {
        return pizza.getCost() + 30.0;
    }
}
