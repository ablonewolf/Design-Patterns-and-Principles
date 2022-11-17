package StructuralPatterns.AdapterPattern.CalculatorAdapter;

public class CalculatorAdapter implements AreaCalculator {
    RectangleCalculator calculator;
    Triangle triangle;

    public CalculatorAdapter(Triangle triangle) {
        this.triangle = triangle;
    }

    @Override
    public double getArea(Rectangle rectangle) {
        rectangle = new Rectangle(this.triangle.getBase() * 0.5, this.triangle.getHeight());
        calculator = new RectangleCalculator();

        return calculator.getArea(rectangle);
    }
}
