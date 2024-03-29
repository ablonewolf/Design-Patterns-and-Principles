package DesignPatterns.CreationalPatterns.AbstractFactoryMethod.ShapeAndColorFactory;

public abstract class AbstractFactory {
    abstract Color getColor(String colorName);

    abstract Shape getShape(String shapeType);
}
