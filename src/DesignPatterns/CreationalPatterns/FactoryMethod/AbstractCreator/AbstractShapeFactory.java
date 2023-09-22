package DesignPatterns.CreationalPatterns.FactoryMethod.AbstractCreator;

abstract public class AbstractShapeFactory {
    protected abstract Shape factoryMethod();

    public Shape getShape() {
        return this.factoryMethod();
    }
}
