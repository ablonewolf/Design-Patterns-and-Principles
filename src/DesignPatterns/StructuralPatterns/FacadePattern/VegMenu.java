package DesignPatterns.StructuralPatterns.FacadePattern;

public class VegMenu implements Menu{
    public VegMenu() {
        System.out.println("Creating a Veg Menu.");
    }

    @Override
    public void showMenu() {
        System.out.println("Menu Items in the Veg Menu.");
    }
}
