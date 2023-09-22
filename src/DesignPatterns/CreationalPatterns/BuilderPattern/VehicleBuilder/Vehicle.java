package DesignPatterns.CreationalPatterns.BuilderPattern.VehicleBuilder;

import java.util.LinkedList;

public class Vehicle {
    private LinkedList<String> parts;
    public Vehicle() {
        parts = new LinkedList<>();
    }
    public void add(String part) {
        this.parts.addLast(part);
    }
    public void show() {
        System.out.println("Vehicle built as below");
        parts.forEach(System.out::println);
    }
}
