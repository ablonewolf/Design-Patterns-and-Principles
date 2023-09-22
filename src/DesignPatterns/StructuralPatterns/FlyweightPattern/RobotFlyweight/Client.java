package DesignPatterns.StructuralPatterns.FlyweightPattern.RobotFlyweight;

import java.util.Random;

public class Client {
    public static void main(String[] args) {
        RobotFactory factory = new RobotFactory();
        System.out.println("**** Flyweight Pattern Demo ******");
        for(int i=0; i<3; i++) {

            Robot robot = factory.getRobot("Small");
//            setting the extrinsic state from the client side
            if(robot != null) {
                robot.setColor(getRandomColor());
                robot.print();
            }
        }

        for(int i=0; i<3; i++) {
            Robot robot = factory.getRobot("Large");
//            setting the extrinsic state from the client side
            if(robot != null) {
                robot.setColor(getRandomColor());
                robot.print();
            }
        }
        System.out.println("Number of total objects have been created : " + factory.numberOfTotalObjects() + ".");
    }

    private static String getRandomColor() {
        Random random = new Random();
        int a = random.nextInt(3);
        return switch (a) {
            case 0 -> "Green";
            case 1 -> "Blue";
            default -> "Red";
        };
    }

}
