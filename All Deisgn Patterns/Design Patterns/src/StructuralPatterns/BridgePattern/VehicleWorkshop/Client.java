package StructuralPatterns.BridgePattern.VehicleWorkshop;

public class Client {
    public static void main(String[] args) {
        Workshop produce = new ProductionWorkshop();
        Workshop assemble = new AssemblingWorkshop();
//        vehicles are not dependent on workshops and vice versa, both abstractions work independently
        Vehicle car = new Car(produce,assemble);
        Vehicle bike = new Bike(produce,assemble);
        car.manufacture();
        bike.manufacture();
    }
}
