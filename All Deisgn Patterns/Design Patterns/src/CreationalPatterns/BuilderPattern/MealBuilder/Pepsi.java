package CreationalPatterns.BuilderPattern.MealBuilder;

public class Pepsi extends ColdDrinks{
    private String name;
    private float price;

    public Pepsi(String name, float price) {
        this.name = name;
        this.price = price;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public float getPrice() {
        return this.price;
    }

    @Override
    public String getPacking() {
        return super.getPacking();
    }
}
