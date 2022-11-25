package StructuralPatterns.FacadePattern;

public class VegHotel implements Hotel{
    @Override
    public Menu getMenus() {
        return new VegMenu();
    }
}
