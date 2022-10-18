package CreationalPatterns.FactoryMethod.ConcreteCreator;

public class Square implements Shape{
    @Override
    public void draw() {
        System.out.println("Square being drawn inside the draw method.");
    }
}
