package StructuralPatterns.FacadePattern;

public class BothMenu implements Menu{
    public BothMenu() {
        System.out.println("Creating a Both Veg and NonVeg menu.");
    }

    @Override
    public void showMenu() {
        System.out.println("Here are the items in the Both Veg and NonVeg menu.");
    }
}
