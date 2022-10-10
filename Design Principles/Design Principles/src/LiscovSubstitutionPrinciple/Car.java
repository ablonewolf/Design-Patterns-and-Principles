package LiscovSubstitutionPrinciple;

public class Car extends Vehicle{
    private int speed;
    private int capacity;
    boolean isAC;

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public void setAC(boolean AC) {
        isAC = AC;
    }

    @Override
    public int getSpeed() {
        return this.speed;
    }

    @Override
    public int getCapacity() {
        return this.capacity;
    }

    public boolean isAC() {
        return isAC;
    }

    @Override
    public String toString() {
        return "Car{" +
                "speed=" + speed +
                ", capacity=" + capacity +
                ", isAC=" + isAC +
                '}';
    }
}
