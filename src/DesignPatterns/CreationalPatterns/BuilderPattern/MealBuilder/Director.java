package DesignPatterns.CreationalPatterns.BuilderPattern.MealBuilder;

public class Director {
    private MealBuilder mealBuilder;
    public void construct(MealBuilder mealBuilder,ColdDrinks drinks) {
        this.mealBuilder = mealBuilder;
        this.mealBuilder.buildBurger();
        this.mealBuilder.addDrink(drinks);
    }
}
