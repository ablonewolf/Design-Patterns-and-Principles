package DesignPatterns.StructuralPatterns.DecoratorPattern.SampleImplementation;

public class ConcreteDecorator2 extends AbstractDecorator{
    @Override
    public void doJob() {
        System.out.println("This is from concrete Decorator 2. Decorating the component");
        super.doJob();
        System.out.println("Decoration has been done successfully.");
    }
}
