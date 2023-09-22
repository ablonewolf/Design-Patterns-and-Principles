package DesignPatterns.StructuralPatterns.FlyweightPattern.CounterStrike;

public class CounterTerrorist implements Player{
    private String task;
    private String weapon;

    public CounterTerrorist() {
        System.out.println("Counter Terrorist created.");
        this.task = "deffuse a bomb";
    }

    @Override
    public void assignWeapon(String weapon) {
        this.weapon = weapon;
    }

    @Override
    public void mission() {
        System.out.println("Counter Terrorist with weapon " + this.getWeapon() + " | Task is " + this.getTask() + ".");
    }
    private String getWeapon() {
        return this.weapon;
    }
    private String getTask() {
        return this.task;
    }
}
