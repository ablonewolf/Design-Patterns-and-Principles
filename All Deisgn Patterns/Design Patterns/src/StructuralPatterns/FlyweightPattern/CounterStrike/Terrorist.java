package StructuralPatterns.FlyweightPattern.CounterStrike;

public class Terrorist implements Player{
    private String task;
    private String weapon;

    public Terrorist() {
        System.out.println("Terrorist Created");
        this.task = "Plan a Bomb";
    }

    @Override
    public void assignWeapon(String weapon) {
        this.weapon = weapon;
    }

    @Override
    public void mission() {
        System.out.println("Terrorist with weapon " + this.getWeapon() + " | Task is " + this.getTask() + ".");
    }
    private String getWeapon() {
        return this.weapon;
    }
    private String getTask() {
        return this.task;
    }
}
