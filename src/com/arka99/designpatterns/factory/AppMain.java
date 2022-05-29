package com.arka99.designpatterns.factory;

public class AppMain {
    public static void main(String[] args) {
        Quadraliteral square = Quadraliteral.Factory.newSquare(5.0);
        Quadraliteral rectangle = Quadraliteral.Factory.newRectangle(4,6);
        System.out.println(square.getArea());
        System.out.println(rectangle.getArea());
    }
}
