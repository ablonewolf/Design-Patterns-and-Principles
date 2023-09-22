package DesignPatterns.CreationalPatterns.BuilderPattern.MealBuilder;

public class Bottle implements Packing{
    @Override
    public String getPacking() {
        return "Bottle";
    }
}
