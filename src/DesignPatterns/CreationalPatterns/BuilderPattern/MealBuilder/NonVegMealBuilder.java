package DesignPatterns.CreationalPatterns.BuilderPattern.MealBuilder;

public class NonVegMealBuilder implements MealBuilder{
    private Meal meal = new Meal();
    @Override
    public void buildBurger() {
        Burger chickenBurger = new ChickenBurger("Chicken Burger",40);
        this.meal.addItem(chickenBurger);
    }

    @Override
    public void addDrink(ColdDrinks drinks) {
        this.meal.addItem(drinks);
    }

    @Override
    public Meal getMeal() {
        return this.meal;
    }
}
