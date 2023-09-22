package DesignPatterns.CreationalPatterns.BuilderPattern.MealBuilder;

import java.util.LinkedList;

public class Meal {
    private float cost = 0;
    private LinkedList<Item> items;

    public Meal() {
        this.items = new LinkedList<>();
    }
    public void addItem(Item item) {
        this.items.addLast(item);
    }
    public void show() {
        System.out.println("The following meal prepared.");
        items.forEach(item -> {
            System.out.println("Item : " + item.getName() + " Packing : " + item.getPacking() + " price : " + item.getPrice());
            this. cost = item.getPrice() + cost;
        });
        System.out.println("Total Cost : " + getCost());
        setCost(0);
        items.clear();
    }
    private float getCost() {
        return this.cost;
    }
    private void setCost(float cost) {
        this.cost = cost;
    }
}
