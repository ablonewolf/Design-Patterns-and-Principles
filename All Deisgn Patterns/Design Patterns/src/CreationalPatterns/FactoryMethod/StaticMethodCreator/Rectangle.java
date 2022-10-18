package CreationalPatterns.FactoryMethod.StaticMethodCreator;



public class Rectangle implements Shape {
    @Override
    public void draw() {
        System.out.println("Rectangle being drawn inside the draw method.");
    }
}
