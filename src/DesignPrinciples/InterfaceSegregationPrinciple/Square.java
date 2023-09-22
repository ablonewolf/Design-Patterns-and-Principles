package DesignPrinciples.InterfaceSegregationPrinciple;

public class Square implements Shape{
    private double length;

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    @Override
    public double getArea() {
        return this.getLength() * this.getLength();
    }

}
