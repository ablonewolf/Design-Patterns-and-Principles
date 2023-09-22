package DesignPatterns.StructuralPatterns.DecoratorPattern.ShapeDecorator;

public class Circle implements Shape{
    @Override
    public void draw() {
        System.out.println("Shape : Circle");
    }
}
