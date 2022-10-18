package CreationalPatterns.AbstractFactoryMethod.ShapeAndColorFactory;

public class Green implements Color{
    @Override
    public void fill() {
        System.out.println("Inside the Green fill method.");
    }
}
