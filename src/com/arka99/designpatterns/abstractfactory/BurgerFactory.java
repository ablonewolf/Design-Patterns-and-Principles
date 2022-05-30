package com.arka99.designpatterns.abstractfactory;

public class BurgerFactory  implements SnackFactory{
    @Override
    public Snack getSnack(String item) {
        if(item.equalsIgnoreCase("chicken")) {
            return new ChickenBurger();
        }
        else if(item.equalsIgnoreCase("cheese")) {
            return new ChesseBurger();
        }
        return null;
    }
}
