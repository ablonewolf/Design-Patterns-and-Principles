package DesignPatterns.CreationalPatterns.BuilderPattern.MealBuilder;

public class Client {
    public static void main(String[] args) {
        System.out.println("Meal Builder using the builder pattern");
        System.out.println("******************");
        System.out.println("******************");
        System.out.println("******************");
        VegMealBuilder vegMealBuilder = new VegMealBuilder();
        NonVegMealBuilder nonVegMealBuilder = new NonVegMealBuilder();
        Director director = new Director();
        ColdDrinks coke = new Coke("Coke", 15);
        ColdDrinks pepsi = new Pepsi("Pepsi", 10);
//        creating a vegmeal with coke
        System.out.println("Veg meal with coke");
        director.construct(vegMealBuilder, coke);
        Meal meal = vegMealBuilder.getMeal();
        meal.show();
        System.out.println("******************");
        System.out.println("******************");
        System.out.println("******************");
//        creating a veg meal with pepsi
        System.out.println("Veg meal with pepsi");
        director.construct(vegMealBuilder, pepsi);
        meal = vegMealBuilder.getMeal();
        meal.show();
        System.out.println("******************");
        System.out.println("******************");
        System.out.println("******************");
//        creating a nonveg meal with coke
        System.out.println("Nonveg meal with coke");
        director.construct(nonVegMealBuilder, coke);
        meal = nonVegMealBuilder.getMeal();
        meal.show();
        System.out.println("******************");
        System.out.println("******************");
        System.out.println("******************");
//        creating a nonveg meal with pepsi
        System.out.println("Nonveg meal with pepsi");
        director.construct(nonVegMealBuilder, pepsi);
        meal = nonVegMealBuilder.getMeal();
        meal.show();
    }
}
