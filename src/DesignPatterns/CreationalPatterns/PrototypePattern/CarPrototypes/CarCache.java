package DesignPatterns.CreationalPatterns.PrototypePattern.CarPrototypes;

import java.util.Hashtable;

public class CarCache {
    private static Hashtable<String,BasicCar> carTable = new Hashtable<>();

    public static BasicCar getCar(String modelName) {
        BasicCar car = carTable.get(modelName);
        return car.clone();
    }
    public static void loadCache() {
        Ford ford = new Ford();
        carTable.put(ford.getModelName(),ford);

        Toyota toyota = new Toyota();
        carTable.put(toyota.getModelName(), toyota);
    }
}
