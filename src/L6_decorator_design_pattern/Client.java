package L6_decorator_design_pattern;

import L6_decorator_design_pattern.componentInterface.Coffee;
import L6_decorator_design_pattern.concreteComponent.PlainCoffee;
import L6_decorator_design_pattern.decorators.MilkDecorator;
import L6_decorator_design_pattern.decorators.SugarDecorator;

public class Client {
    public static void main(String[] args) {
        // Plain Coffee
        Coffee plainCoffee = new PlainCoffee();
        System.out.println("Description: " + plainCoffee.getDescription());
        System.out.println("Cost: $" + plainCoffee.getCost());

        // Coffee with milk
        Coffee milkCoffee = new MilkDecorator(plainCoffee);
        System.out.println("Description: " + milkCoffee.getDescription());
        System.out.println("Cost: $" + milkCoffee.getCost());

        // coffee with sugar and milk
        Coffee sugarAndMilkCoffee = new SugarDecorator(new MilkDecorator(plainCoffee));
        System.out.println("Description: " + sugarAndMilkCoffee.getDescription());
        System.out.println("Cost: $" + sugarAndMilkCoffee.getCost());

    }
}
