package DesignPrinciples.InterfaceSegregationPrinciple;

public class Cube implements Shape,SolidShape{

    private double length;


    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    @Override
    public double getArea() {
        return 6 * this.getLength() * this.getLength();
    }

    @Override
    public double getVolume() {
       return this.getArea() * this.getLength();
    }
}
