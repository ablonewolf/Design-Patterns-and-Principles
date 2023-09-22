package DesignPatterns.CreationalPatterns.BuilderPattern.VehicleBuilder;

public class Director {
    public void construct(BuilderInterface myBuilder) {
        myBuilder.initiateVehicle();
        myBuilder.buildBody();
        myBuilder.insertWheels();
        myBuilder.addHeadlights();
    }
}
