package CreationalPatterns.AbstractFactoryMethod.ShapeAndColorFactory;

public class Client {
    public static void main(String[] args) {
        AbstractFactory shapeFactory = FactoryProducer.getFactory("Shape");
        Shape sqaure = shapeFactory.getShape("Square");
        sqaure.draw();
        Shape circle = shapeFactory.getShape("Circle");
        circle.draw();
        Shape rectangle = shapeFactory.getShape("Rectangle");
        rectangle.draw();

        AbstractFactory colorFactory = FactoryProducer.getFactory("Color");
        Color red = colorFactory.getColor("Red");
        red.fill();
        Color blue = colorFactory.getColor("Blue");
        blue.fill();
        Color green = colorFactory.getColor("Green");
        green.fill();
    }
}
