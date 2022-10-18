package CreationalPatterns.FactoryMethod.ConcreteCreator;

public class Client {
    public static void main(String[] args) {
        ShapeFactory factory = new ShapeFactory();
        Shape shape1 = factory.getShape("Circle");
        shape1.draw();
        Shape shape2 = factory.getShape("Rectangle");
        shape2.draw();
        Shape shape3 = factory.getShape("Square");
        shape3.draw();
    }
}
