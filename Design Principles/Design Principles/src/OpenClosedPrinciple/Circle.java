package OpenClosedPrinciple;

public class Circle implements Shape{
    private double radius;

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public double calculateArea() {
        return 3.14 * this.getRadius() * this.getRadius();
    }
}
