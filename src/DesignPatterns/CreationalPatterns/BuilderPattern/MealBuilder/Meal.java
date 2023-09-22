package DesignPatterns.CreationalPatterns.BuilderPattern.MealBuilder;

import java.util.LinkedList;

public class Meal {
    private float cost;
    private final LinkedList<Item> items;

    public Meal() {
        this.cost = 0;
        this.items = new LinkedList<>();
    }

    public void addItem(Item item) {
        this.items.addLast(item);
    }

    public void show() {
        System.out.println("The following meal prepared.");
        items.forEach(item -> {
            System.out.println(
                "Item : " + item.getName() + " Packing : " + item.getPacking() + " price : " + item.getPrice());
            this.cost = item.getPrice() + cost;
        });
        System.out.println("Total Cost : " + getCost());
    }

    private float getCost() {
        return this.cost;
    }

}
