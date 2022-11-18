package StructuralPatterns.BridgePattern.VehicleWorkshop;

public class Bike extends Vehicle{
    public Bike(Workshop workshop1, Workshop workshop2) {
        super(workshop1, workshop2);
    }

    @Override
    public void manufacture() {
        System.out.println("Bike being manufactured");
        workshop1.work();
        workshop2.work();
    }
}
