package CreationalPatterns.BuilderPattern.MealBuilder;

public class Coke extends ColdDrinks{
    private String name;
    private float price;

    public Coke(String name, float price) {
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
