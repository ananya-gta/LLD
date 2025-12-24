package creational_design_pattern.L6_factory_design_pattern.simple_factory;

public class Main {
    public static void main(String[] args) {
        // not creating objects using new
        Shape shape = ShapeFactory.getShape("circle");
        assert shape != null;
        shape.draw();
        shape = ShapeFactory.getShape("square");
        assert shape != null;
        shape.draw();
    }
}
