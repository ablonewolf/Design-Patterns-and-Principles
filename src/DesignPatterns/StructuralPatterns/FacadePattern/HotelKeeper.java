package DesignPatterns.StructuralPatterns.FacadePattern;

public class HotelKeeper {

    public Menu getVegMenu() {
        Hotel vegHotel = new VegHotel();
        return vegHotel.getMenus();
    }
    public Menu getNonVegMenu() {
        Hotel nonVegHotel = new NonVegHotel();
        return nonVegHotel.getMenus();
    }
    public Menu getBothMenu() {
        Hotel bothHotel = new BothMenuHotel();
        return bothHotel.getMenus();
    }
}
