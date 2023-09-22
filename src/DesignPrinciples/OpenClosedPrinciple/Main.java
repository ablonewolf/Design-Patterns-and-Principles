package DesignPrinciples.OpenClosedPrinciple;

public class Main {
    public static void main(String[] args) {
        Shape circle = new Circle();
        AreaCalculator calculator = new AreaCalculator();
        ((Circle) circle).setRadius(5);
        System.out.println("Area of the circle : " + calculator.calcArea(circle));
        Shape rectangle = new Rectangle();
        ((Rectangle) rectangle).setLength(4);
        ((Rectangle) rectangle).setWidth(5);
        System.out.println("Area of the rectanble : " + calculator.calcArea(rectangle));

    }
}
