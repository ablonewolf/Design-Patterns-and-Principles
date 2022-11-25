package StructuralPatterns.FacadePattern;

public class BothMenuHotel implements Hotel{
    @Override
    public Menu getMenus() {
        return new BothMenu();
    }
}
