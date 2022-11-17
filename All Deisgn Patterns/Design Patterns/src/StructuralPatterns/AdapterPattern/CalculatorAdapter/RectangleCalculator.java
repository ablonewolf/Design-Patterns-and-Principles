package StructuralPatterns.AdapterPattern.CalculatorAdapter;

public class RectangleCalculator implements AreaCalculator {
    @Override
    public double getArea(Rectangle rectangle) {
        return rectangle.getLength() * rectangle.getWidth();
    }
}
