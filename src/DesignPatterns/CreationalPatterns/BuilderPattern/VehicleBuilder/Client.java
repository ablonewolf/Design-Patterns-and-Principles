package DesignPatterns.CreationalPatterns.BuilderPattern.VehicleBuilder;

public class Client {
    public static void main(String[] args) {
        System.out.println("Builder pattern Demo using vehicle builder");
        System.out.println("***************************");
        System.out.println("***************************");
        System.out.println("***************************");
        BuilderInterface carBuilder = new CarBuilder();
        BuilderInterface motorcycleBuilder = new MotorcycleBuilder();
        Director director = new Director();
//        making a car
        director.construct(carBuilder);
        Vehicle car = carBuilder.getVehicle();
        car.show();
        System.out.println("***************************");
        System.out.println("***************************");
        System.out.println("***************************");
//        making a motorcycle
        director.construct(motorcycleBuilder);
        Vehicle motorcycle = motorcycleBuilder.getVehicle();
        motorcycle.show();


    }
}
