package DesignPatterns.CreationalPatterns.BuilderPattern.MealBuilder;

public interface MealBuilder {
    public void buildBurger();
    public void addDrink(ColdDrinks drinks);
    public Meal getMeal();
}
