package DesignPatterns.StructuralPatterns.FacadePattern;

public class NonVegHotel implements Hotel{
    @Override
    public Menu getMenus() {
        return new NonVegMenu();
    }
}
