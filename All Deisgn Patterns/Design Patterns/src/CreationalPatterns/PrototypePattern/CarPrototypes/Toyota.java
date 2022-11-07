package CreationalPatterns.PrototypePattern.CarPrototypes;

public class Toyota extends BasicCar {

    @Override
    public BasicCar clone() {
        Toyota clone = null;
        clone = (Toyota) super.clone();
        return clone;
    }

    public Toyota() {
        this.setModelName("Toyota");
    }

    @Override
    public void buildCar() {
        System.out.println("A " + this.getColor() + " " + this.getModelName() + " is being built, with a price of " + this.getPrice() + ".");
    }
}
