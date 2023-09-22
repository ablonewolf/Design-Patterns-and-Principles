package DesignPatterns.CreationalPatterns.BuilderPattern.MealBuilder;

public abstract class ColdDrinks implements Item {
    Bottle bottle = new Bottle();
    @Override
    public String getPacking() {
        return this.bottle.getPacking();
    }
}
