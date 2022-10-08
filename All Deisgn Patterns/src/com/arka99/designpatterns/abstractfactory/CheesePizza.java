package com.arka99.designpatterns.abstractfactory;

public class CheesePizza implements Snack {
    @Override
    public void prepare() {
        System.out.println("Cheese Pizza is being prepared.");
    }

    @Override
    public void serve() {
        System.out.println("Cheese Pizza is being served.");
    }
}
