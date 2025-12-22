package L6_decorator_design_pattern.concreteComponent;

import L6_decorator_design_pattern.componentInterface.Pizza;

public class BasePizza implements Pizza {
    @Override
    public String getDescription() {
        return "Base pizza";
    }

    @Override
    public double getCost() {
        return 100;
    }
}
