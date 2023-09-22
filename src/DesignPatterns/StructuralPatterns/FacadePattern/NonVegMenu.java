package DesignPatterns.StructuralPatterns.FacadePattern;

public class NonVegMenu implements Menu{
    public NonVegMenu() {
        System.out.println("Creating a Non-Veg Menu.");
    }

    @Override
    public void showMenu() {
        System.out.println("Menu Items in the Non-Veg menu.");
    }
}
