package DesignPatterns.CreationalPatterns.AbstractFactoryMethod.ShapeAndColorFactory;

public class ShapeFactory extends AbstractFactory {
    @Override
    Color getColor(String colorName) {
        return null;
    }

    @Override
    Shape getShape(String shapeType) {
        return switch (shapeType.toLowerCase()) {
            case "circle" -> new Circle();
            case "rectangle" -> new Rectangle();
            case "square" -> new Square();
            default -> null;
        };
    }
}
