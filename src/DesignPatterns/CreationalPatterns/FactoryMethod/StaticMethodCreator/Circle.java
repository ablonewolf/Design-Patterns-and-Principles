package DesignPatterns.CreationalPatterns.FactoryMethod.StaticMethodCreator;

public class Circle implements Shape {
    @Override
    public void draw() {
        System.out.println("Circle being drawn inside the draw method.");
    }
}
