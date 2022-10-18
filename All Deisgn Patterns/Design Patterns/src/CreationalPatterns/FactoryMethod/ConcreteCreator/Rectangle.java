package CreationalPatterns.FactoryMethod.ConcreteCreator;

public class Rectangle implements Shape{
    @Override
    public void draw() {
        System.out.println("Rectangle being inside the draw method.");
    }
}
