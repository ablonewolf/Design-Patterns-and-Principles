package DesignPatterns.StructuralPatterns.FlyweightPattern.RobotFlyweight;

public class SmallRobot implements Robot{
    private String color;
    @Override
    public void setColor(String color) {
        this.color = color;
    }

    private String getColor() {
        return this.color;
    }

    @Override
    public void print() {
        System.out.println("I am a small Robot with " + this.getColor() + ".");
    }
}
