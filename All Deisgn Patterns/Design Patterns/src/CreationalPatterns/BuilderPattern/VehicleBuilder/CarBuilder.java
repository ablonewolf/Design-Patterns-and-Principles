package CreationalPatterns.BuilderPattern.VehicleBuilder;

public class CarBuilder implements BuilderInterface{
    private Vehicle car = new Vehicle();
    @Override
    public void buildBody() {
        car.add("This is a body of car.");
    }

    @Override
    public void insertWheels() {
        car.add("4 wheels have been added to the car");
    }

    @Override
    public void addHeadlights() {
        car.add("2 headlights have added to the car");
    }

    @Override
    public Vehicle getVehicle() {
        return this.car;
    }
}
