package DesignPatterns.CreationalPatterns.FactoryMethod.AbstractCreator;

public class CircleFactory extends AbstractShapeFactory{
    @Override
    protected Shape factoryMethod() {
        return new Circle();
    }
}
