package CreationalPatterns.PrototypePattern.CarPrototypes;

public class Ford extends BasicCar{
    public Ford() {
        this.setModelName("Ford");
    }
    @Override
    public void buildCar() {
        System.out.println("A " + this.getColor() + " " + this.getModelName() + " is being built, with a price of " + this.getPrice() + ".");
    }

    @Override
    public Ford clone() {
        Ford clone = null;
        clone = (Ford) super.clone();
        return clone;
    }
}
