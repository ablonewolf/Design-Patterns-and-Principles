package com.arka99.designpatterns.abstractfactory;

public class ChickenBurger implements Snack {
    @Override
    public void prepare() {
        System.out.println("Chicken Burger is being prepared.");
    }

    @Override
    public void serve() {
        System.out.println("Chicken Burger is being served.");
    }
}
