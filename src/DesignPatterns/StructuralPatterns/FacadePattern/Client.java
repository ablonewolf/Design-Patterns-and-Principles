package DesignPatterns.StructuralPatterns.FacadePattern;

public class Client {
    public static void main(String[] args) {
        HotelKeeper keeper = new HotelKeeper();
        Menu menu = keeper.getVegMenu();
        menu.showMenu();
        menu = keeper.getNonVegMenu();
        menu.showMenu();
        menu = keeper.getNonVegMenu();
        menu.showMenu();
    }
}
