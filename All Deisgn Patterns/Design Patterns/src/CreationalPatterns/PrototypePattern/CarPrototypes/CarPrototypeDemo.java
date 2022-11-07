package CreationalPatterns.PrototypePattern.CarPrototypes;

public class CarPrototypeDemo {
    public static void main(String[] args) {
        CarCache.loadCache();
        BasicCar basicCar1 = CarCache.getCar("Ford");
        basicCar1.setColor("Black");
        basicCar1.setPrice(500);
        basicCar1.buildCar();
        System.out.println("Car is : " + basicCar1.getColor() + " " + basicCar1.getModelName() + " and its price is : " + basicCar1.getPrice() + ".");
        System.out.println("**************************************************");
        BasicCar basicCar = CarCache.getCar("Toyota");
        basicCar.setColor("Yellow");
        basicCar.setPrice(300);
        basicCar.buildCar();
        System.out.println("Car is : " + basicCar.getColor() + " " + basicCar.getModelName() + " and its price is : " + basicCar.getPrice() + ".");
        BasicCar basicCar2 = basicCar1.clone();
        System.out.println(basicCar2==basicCar1);
        basicCar2.setPrice(400);
        basicCar2.buildCar();

    }
}
