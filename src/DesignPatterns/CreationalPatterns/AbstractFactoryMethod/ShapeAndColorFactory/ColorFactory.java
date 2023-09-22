package DesignPatterns.CreationalPatterns.AbstractFactoryMethod.ShapeAndColorFactory;

public class ColorFactory extends AbstractFactory {
    @Override
    Color getColor(String colorName) {
        return switch (colorName.toLowerCase()) {
            case "red" -> new Red();
            case "blue" -> new Blue();
            case "green" -> new Green();
            default -> null;
        };
    }

    @Override
    Shape getShape(String shapeType) {
        return null;
    }
}
