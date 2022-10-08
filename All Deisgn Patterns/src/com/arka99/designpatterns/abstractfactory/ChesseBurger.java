package com.arka99.designpatterns.abstractfactory;

public class ChesseBurger implements Snack {
    @Override
    public void prepare() {
        System.out.println("Cheese Burger is being prepared.");
    }

    @Override
    public void serve() {
        System.out.println("Cheese Burger is being served.");
    }
}
