package DesignPatterns.CreationalPatterns.AbstractFactoryMethod.ShapeAndColorFactory;

public class Red implements Color {
    @Override
    public void fill() {
        System.out.println("Inside the Red fill method.");
    }
}
