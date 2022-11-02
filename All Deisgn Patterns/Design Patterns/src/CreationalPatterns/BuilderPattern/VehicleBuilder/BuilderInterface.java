package CreationalPatterns.BuilderPattern.VehicleBuilder;

public interface BuilderInterface {
    void buildBody();
    void insertWheels();
    void addHeadlights();
    Vehicle getVehicle();
}
