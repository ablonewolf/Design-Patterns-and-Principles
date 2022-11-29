package StructuralPatterns.FlyweightPattern.RobotFlyweight;

public class LargeRobot implements Robot{
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
        System.out.println("I am a large robot with " + this.getColor() +".");
    }

}
