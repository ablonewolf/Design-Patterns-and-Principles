package DesignPatterns.CreationalPatterns.BuilderPattern.MealBuilder;

import java.util.Objects;

public class NonVegMealBuilder implements MealBuilder {
    private Meal meal;

    @Override
    public void initiateMeal() {
        this.meal = new Meal();
    }

    @Override
    public void prepareBurger() {
        if (Objects.nonNull(this.meal)) {
            Burger chickenBurger = new ChickenBurger("Chicken Burger", 40);
            this.meal.addItem(chickenBurger);
        } else {
            System.out.println("Please initiate the mela first.");
        }
    }

    @Override
    public void addDrink(ColdDrinks drinks) {
        if (Objects.nonNull(this.meal)) {
            this.meal.addItem(drinks);
        } else {
            System.out.println("Please initiate the meal first.");
        }
    }

    @Override
    public Meal getMeal() {
        return this.meal;
    }
}
