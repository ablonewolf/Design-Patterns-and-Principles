package DesignPatterns.CreationalPatterns.AbstractFactoryMethod.ShapeAndColorFactory;

public class Rectangle implements Shape {
    @Override
    public void draw() {
        System.out.println("Rectangle drawn inside the draw method.");
    }
}
