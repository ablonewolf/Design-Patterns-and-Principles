package DesignPatterns.CreationalPatterns.BuilderPattern.MealBuilder;

import java.util.Objects;

public class VegMealBuilder implements MealBuilder {
    private Meal meal;

    @Override
    public void initiateMeal() {
        this.meal = new Meal();
    }

    @Override
    public void prepareBurger() {
        if (Objects.nonNull(this.meal)) {
            Burger vegBurger = new VegBurger("Vegetable Burger", 35);
            System.out.println("adding burger");
            this.meal.addItem(vegBurger);
        } else {
            System.out.println("Please initiate the meal first.");
        }
    }

    @Override
    public void addDrink(ColdDrinks drinks) {
        if (Objects.nonNull(this.meal)) {
            System.out.println("adding cold drinks");
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
