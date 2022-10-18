package CreationalPatterns.FactoryMethod.AbstractCreator;

public class Circle implements Shape{
    @Override
    public void draw() {
        System.out.println("Circle being drawn using the draw method.");
    }
}
