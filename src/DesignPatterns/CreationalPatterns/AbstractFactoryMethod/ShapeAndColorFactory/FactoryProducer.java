package DesignPatterns.CreationalPatterns.AbstractFactoryMethod.ShapeAndColorFactory;

public class FactoryProducer {
    public static AbstractFactory getFactory(String choice) {
        return switch (choice.toLowerCase()) {
            case "shape" -> new ShapeFactory();
            case "color" -> new ColorFactory();
            default -> null;
        };
    }
}
