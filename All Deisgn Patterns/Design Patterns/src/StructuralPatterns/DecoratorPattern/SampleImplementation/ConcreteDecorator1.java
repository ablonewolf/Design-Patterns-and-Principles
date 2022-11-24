package StructuralPatterns.DecoratorPattern.SampleImplementation;

public class ConcreteDecorator1 extends AbstractDecorator{

    @Override
    public void doJob() {
        System.out.println("This is from concrete Decorator 1. Decorating the component object");
        super.doJob();
        System.out.println("Decoration has been done");
    }
}
