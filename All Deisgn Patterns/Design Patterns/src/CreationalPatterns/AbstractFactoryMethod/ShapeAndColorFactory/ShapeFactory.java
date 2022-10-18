package CreationalPatterns.AbstractFactoryMethod.ShapeAndColorFactory;

public class ShapeFactory extends AbstractFactory{
    @Override
    Color getColor(String colorName) {
        return null;
    }

    @Override
    Shape getShape(String shapeType) {
        switch (shapeType.toLowerCase()) {
            case "circle":
                return new Circle();
            case "rectangle":
                return new Rectangle();
            case "square":
                return new Square();
            default:
                return null;
        }
    }
}
