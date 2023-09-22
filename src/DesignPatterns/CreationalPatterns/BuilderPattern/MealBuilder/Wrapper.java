package DesignPatterns.CreationalPatterns.BuilderPattern.MealBuilder;

public class Wrapper implements Packing{
    @Override
    public String getPacking() {
        return "Wrapper";
    }
}
