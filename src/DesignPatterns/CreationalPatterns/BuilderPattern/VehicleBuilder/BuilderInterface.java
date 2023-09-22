package DesignPatterns.CreationalPatterns.BuilderPattern.VehicleBuilder;

public interface BuilderInterface {

    void initiateVehicle();

    void buildBody();

    void insertWheels();

    void addHeadlights();

    Vehicle getVehicle();
}
