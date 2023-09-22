package DesignPatterns.CreationalPatterns.AbstractFactoryMethod.ShapeAndColorFactory;

public class Circle implements Shape{
    @Override
    public void draw() {
        System.out.println("Circle drawn inside the draw method.");
    }
}
