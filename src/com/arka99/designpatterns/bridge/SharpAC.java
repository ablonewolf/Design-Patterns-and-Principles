package com.arka99.designpatterns.bridge;

public class SharpAC implements AirConditioner{
    @Override
    public void turnOn() {
        System.out.println("Turning on the Sharp AC.");
    }

    @Override
    public void turnOff() {
        System.out.println("Turning off the Sharp AC.");
    }
}
