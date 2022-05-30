package com.arka99.designpatterns.abstractfactory;

public class PizzaFactory implements SnackFactory{
    @Override
    public Snack getSnack(String item) {
        if(item.equalsIgnoreCase("chicken")) {
            return new ChickenPizza();
        }
        else if(item.equalsIgnoreCase("cheese")) {
            return new CheesePizza();
        }
        return null;
    }
}
