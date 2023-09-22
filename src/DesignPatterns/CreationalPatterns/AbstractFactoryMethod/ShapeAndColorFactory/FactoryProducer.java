package DesignPatterns.CreationalPatterns.AbstractFactoryMethod.ShapeAndColorFactory;

public class FactoryProducer {
    public static AbstractFactory getFactory(String choice) {
        switch (choice.toLowerCase()) {
            case "shape":
                return new ShapeFactory();
            case "color":
                return new ColorFactory();
            default:
                return null;
        }
    }
}
