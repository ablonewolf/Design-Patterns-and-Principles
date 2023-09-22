package DesignPrinciples.LiscovSubstitutionPrinciple;

public class Bus extends Vehicle{
    private int speed;
    private int capacity;
    Boolean hasEmerExit;

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public void setHasEmerExit(Boolean hasEmerExit) {
        this.hasEmerExit = hasEmerExit;
    }

    @Override
    public int getSpeed() {
        return this.speed;
    }

    @Override
    public int getCapacity() {
        return this.capacity;
    }

    public Boolean getHasEmerExit() {
        return hasEmerExit;
    }

    @Override
    public String toString() {
        return "Bus{" +
                "speed=" + speed +
                ", capacity=" + capacity +
                ", hasEmerExit=" + hasEmerExit +
                '}';
    }
}
