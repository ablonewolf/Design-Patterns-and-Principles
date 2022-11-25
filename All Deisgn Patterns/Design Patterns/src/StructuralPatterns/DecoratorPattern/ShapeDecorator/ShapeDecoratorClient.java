package StructuralPatterns.DecoratorPattern.ShapeDecorator;

public class ShapeDecoratorClient {
    public static void main(String[] args) {
        Shape circle = new Circle();
        Shape rectangle = new Rectangle();
        System.out.println("Circle With Normal Border.");
        circle.draw();
        ShapeDecorator redDecorator = new RedDecorator();
        redDecorator.setShape(circle);
        System.out.println("Circle With Red Border.");
        redDecorator.draw();
        ShapeDecorator greenDecorator = new GreenDecorator();
        greenDecorator.setShape(rectangle);
        System.out.println("Rectangle With Green Border.");
        greenDecorator.draw();
    }
}
