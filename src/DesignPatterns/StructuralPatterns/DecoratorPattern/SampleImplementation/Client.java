package DesignPatterns.StructuralPatterns.DecoratorPattern.SampleImplementation;

public class Client {
    public static void main(String[] args) {
        System.out.println("Decorator Pattern Sample Implementation");
        System.out.println("***************************************");
        System.out.println("***************************************");
        Component component1 = new ConcreteComponent();
        AbstractDecorator decorator1 = new ConcreteDecorator1();
        decorator1.setComponent(component1);
        decorator1.doJob();
        System.out.println("***************************************");
        System.out.println("***************************************");
        AbstractDecorator decorator2 = new ConcreteDecorator2();
        decorator2.setComponent(component1);
        decorator2.doJob();
    }
}
