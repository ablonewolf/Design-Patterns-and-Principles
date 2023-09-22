package DesignPatterns.CreationalPatterns.BuilderPattern.MealBuilder;

public interface MealBuilder {

    void initiateMeal();

    void prepareBurger();

    void addDrink(ColdDrinks drinks);

    Meal getMeal();
}
