package CreationalPatterns.BuilderPattern.MealBuilder;

public class VegMealBuilder implements MealBuilder{
    private Meal meal = new Meal();
    @Override
    public void buildBurger() {
        Burger vegBurger = new VegBurger("Vegetable Burger",35);
        System.out.println("adding burger");
        this.meal.addItem(vegBurger);
    }

    @Override
    public void addDrink(ColdDrinks drinks) {
        System.out.println("adding colddrinks");
        this.meal.addItem(drinks);
    }

    @Override
    public Meal getMeal() {
        return this.meal;
    }
}
