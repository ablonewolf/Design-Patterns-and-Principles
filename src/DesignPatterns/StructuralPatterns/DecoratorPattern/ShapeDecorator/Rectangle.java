package DesignPatterns.StructuralPatterns.DecoratorPattern.ShapeDecorator;

public class Rectangle implements Shape{
    @Override
    public void draw() {
        System.out.println("Shape : Rectangle");
    }
}
