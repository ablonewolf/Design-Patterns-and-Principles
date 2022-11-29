package StructuralPatterns.FlyweightPattern.RobotFlyweight;

import java.util.HashMap;
import java.util.Map;

public class RobotFactory {
//    A collection to store already created robots
    private Map<String,Robot> robots;

    public RobotFactory() {
        this.robots = new HashMap<>();
    }

    public int numberOfTotalObjects() {
        return this.robots.size();
    }
    public Robot getRobot(String robotCategory) {
        Robot robot = null;
        if(robots.containsKey(robotCategory.toLowerCase())) {
            robot = robots.get(robotCategory.toLowerCase());
        }
        else {
            switch (robotCategory.toLowerCase()) {
                case "small":
                {
                    System.out.println("We don't have small robot right now. So we are creating one for you.");
                    Robot smallRobot = new SmallRobot();
                    robots.put("small",smallRobot);
                    break;
                }
                case "large":
                {
                    System.out.println("We don't have large robots right now. So we are creating one for you.");
                    Robot largeRobot = new LargeRobot();
                    robots.put("large",largeRobot);
                    break;
                }
                default:
                    System.out.println("We can only create Small and large Robots");;
            }
        }
        return robot;
    }
    public Map<String,Robot> getRobots() {
        return this.robots;
    }
}
