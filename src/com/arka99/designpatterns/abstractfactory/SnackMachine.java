package com.arka99.designpatterns.abstractfactory;

public class SnackMachine {
    public static SnackFactory getFactory(String item){
        if(item.equalsIgnoreCase("burger")) {
            return new BurgerFactory();
        }
        else if(item.equalsIgnoreCase("pizza")) {
            return new PizzaFactory();
        }
        return null;
    }
}
