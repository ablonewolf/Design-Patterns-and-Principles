package DesignPatterns.CreationalPatterns.BuilderPattern.MealBuilder;

public class Director {

    public void construct(MealBuilder mealBuilder, ColdDrinks drinks) {
        mealBuilder.initiateMeal();
        mealBuilder.prepareBurger();
        mealBuilder.addDrink(drinks);
    }
}
