package StructuralPatterns.BridgePattern.VehicleWorkshop;

public class ProductionWorkshop extends Workshop{
    @Override
    public void work() {
        System.out.println("Production is being done in the production workshop.");
    }
}
