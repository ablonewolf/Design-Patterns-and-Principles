package DesignPatterns.CreationalPatterns.AbstractFactoryMethod.ShapeAndColorFactory;

public class Square implements Shape{
    @Override
    public void draw() {
        System.out.println("Square drawn inside the draw method.");
    }
}
