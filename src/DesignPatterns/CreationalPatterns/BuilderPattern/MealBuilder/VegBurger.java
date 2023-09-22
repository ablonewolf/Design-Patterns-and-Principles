package DesignPatterns.CreationalPatterns.BuilderPattern.MealBuilder;

public class VegBurger extends Burger{
    private String name;
    private float price;

    public VegBurger(String name, float price) {
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
