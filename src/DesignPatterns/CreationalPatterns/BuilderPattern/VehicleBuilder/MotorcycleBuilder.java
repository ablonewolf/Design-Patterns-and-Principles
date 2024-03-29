package DesignPatterns.CreationalPatterns.BuilderPattern.VehicleBuilder;

public class MotorcycleBuilder implements BuilderInterface {
    private Vehicle motorCycle;

    @Override
    public void initiateVehicle() {
        this.motorCycle = new Vehicle();
        System.out.println("A new motorcycle is being created.");
    }

    @Override
    public void buildBody() {
        motorCycle.add("This is the body of a motorcycle.");
    }

    @Override
    public void insertWheels() {
        motorCycle.add("2 wheels have been added to the motorcycle.");
    }

    @Override
    public void addHeadlights() {
        motorCycle.add("1 headlights have been added to the motorcycle. ");
    }

    @Override
    public Vehicle getVehicle() {
        return this.motorCycle;
    }
}
