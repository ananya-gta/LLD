package structural_design_pattern.L6_decorator_design_pattern;

import structural_design_pattern.L6_decorator_design_pattern.componentInterface.Coffee;
import structural_design_pattern.L6_decorator_design_pattern.componentInterface.Pizza;
import structural_design_pattern.L6_decorator_design_pattern.concreteComponent.BasePizza;
import structural_design_pattern.L6_decorator_design_pattern.concreteComponent.PlainCoffee;
import structural_design_pattern.L6_decorator_design_pattern.concreteDecorators.ExtraCheeseDecorator;
import structural_design_pattern.L6_decorator_design_pattern.concreteDecorators.MilkCoffeeDecorator;
import structural_design_pattern.L6_decorator_design_pattern.concreteDecorators.MushroomDecorator;
import structural_design_pattern.L6_decorator_design_pattern.concreteDecorators.SugarCoffeeDecorator;

public class Client {
    public static void main(String[] args) {
        // Plain Coffee
        Coffee plainCoffee = new PlainCoffee();
        System.out.println("Description: " + plainCoffee.getDescription());
        System.out.println("Cost: $" + plainCoffee.getCost());

        // Coffee with milk
        Coffee milkCoffee = new MilkCoffeeDecorator(plainCoffee);
        System.out.println("Description: " + milkCoffee.getDescription());
        System.out.println("Cost: $" + milkCoffee.getCost());

        // coffee with sugar and milk
        Coffee sugarAndMilkCoffee = new SugarCoffeeDecorator(new MilkCoffeeDecorator(plainCoffee));
        System.out.println("Description: " + sugarAndMilkCoffee.getDescription());
        System.out.println("Cost: $" + sugarAndMilkCoffee.getCost());

        // Base pizza
        Pizza basePizza = new BasePizza();
        System.out.println("Description: " + basePizza.getDescription());
        System.out.println("Cost: $" + basePizza.getCost());

        // pizza with extra cheese
        basePizza = new ExtraCheeseDecorator(new BasePizza());
        System.out.println("Description: " + basePizza.getDescription());
        System.out.println("Cost: $" + basePizza.getCost());

        // pizza with extra cheese and mushroom
        basePizza = new MushroomDecorator(new ExtraCheeseDecorator(new BasePizza()));
        System.out.println("Description: " + basePizza.getDescription());
        System.out.println("Cost: $" + basePizza.getCost());
    }
}
