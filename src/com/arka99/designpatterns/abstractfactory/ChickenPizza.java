package com.arka99.designpatterns.abstractfactory;

public class ChickenPizza implements Snack {
    @Override
    public void prepare() {
        System.out.println("Chicken Pizza is being prepared.");
    }

    @Override
    public void serve() {
        System.out.println("Chicken Pizza is being served.");
    }
}
