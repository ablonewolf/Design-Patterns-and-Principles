package com.arka99.designpatterns.factory;

public class Quadraliteral {
    private double a;
    private double b;
    private double c;
    private double d;
    private Quadraliteral(double a, double b, double c, double d) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
    }

    public static class Factory {
        public static Quadraliteral newSquare(double a) {
            return new Quadraliteral(a,a,a,a);
        }

        public static Quadraliteral newRectangle(double a, double b) {
            return new Quadraliteral(a,b,a,b);
        }
    }
    public double getArea() {
        return (.5 * (this.a * this.d + this.b * this.c) * Math.sin(Math.toRadians(90)));
    }
}
