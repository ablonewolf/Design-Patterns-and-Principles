package CreationalPatterns.FactoryMethod.AbstractCreator;

public class Rectangle implements Shape{
    @Override
    public void draw() {
        System.out.println("Rectangle being drawn using the draw method.");
    }
}
