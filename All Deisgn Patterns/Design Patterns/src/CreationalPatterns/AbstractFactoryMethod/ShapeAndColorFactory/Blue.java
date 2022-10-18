package CreationalPatterns.AbstractFactoryMethod.ShapeAndColorFactory;

public class Blue implements Color{
    @Override
    public void fill() {
        System.out.println("Inside the Blue fill method.");
    }
}
