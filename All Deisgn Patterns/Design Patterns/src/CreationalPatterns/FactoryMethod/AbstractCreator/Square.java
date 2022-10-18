package CreationalPatterns.FactoryMethod.AbstractCreator;

public class Square implements Shape{
    @Override
    public void draw() {
        System.out.println("Square being drawn using the draw method.");
    }
}
