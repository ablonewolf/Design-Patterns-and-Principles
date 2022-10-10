package OpenClosedPrinciple;

public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle();
        AreaCalculator calculator = new AreaCalculator();
        circle.setRadius(5);
        System.out.println("Area of the circle : " + calculator.calcArea(circle));
        Rectangle rectangle = new Rectangle();
        rectangle.setLength(4);
        rectangle.setWidth(5);
        System.out.println("Area of the rectanble : " + calculator.calcArea(rectangle));

    }
}
