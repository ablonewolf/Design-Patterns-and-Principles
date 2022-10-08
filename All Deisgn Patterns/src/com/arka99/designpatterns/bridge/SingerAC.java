package com.arka99.designpatterns.bridge;

public class SingerAC implements AirConditioner{
    @Override
    public void turnOn() {
        System.out.println("Turning on Singer AC.");
    }

    @Override
    public void turnOff() {
        System.out.println("Turning off Singer AC.");
    }
}
