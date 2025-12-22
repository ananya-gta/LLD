package L6_decorator_design_pattern.decoratorInterface;

import L6_decorator_design_pattern.componentInterface.Coffee;

// wrapper base class
public abstract class Decorator implements Coffee {
    protected Coffee coffee;
    public Decorator(Coffee decoratedCoffee) {
        this.coffee = decoratedCoffee;
    }
    @Override
    public String getDescription() {
        return coffee.getDescription();
    }

    @Override
    public double getCost() {
        return coffee.getCost();
    }
}
