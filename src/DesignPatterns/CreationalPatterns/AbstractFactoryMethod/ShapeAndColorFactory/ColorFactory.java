package DesignPatterns.CreationalPatterns.AbstractFactoryMethod.ShapeAndColorFactory;

public class ColorFactory extends AbstractFactory{
    @Override
    Color getColor(String colorName) {
        switch (colorName.toLowerCase()) {
            case "red":
                return new Red();
            case "blue":
                return new Blue();
            case "green":
                return new Green();
            default:
                return null;
        }
    }

    @Override
    Shape getShape(String shapeType) {
        return null;
    }
}
