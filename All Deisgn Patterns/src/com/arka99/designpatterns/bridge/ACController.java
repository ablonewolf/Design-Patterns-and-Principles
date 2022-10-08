package com.arka99.designpatterns.bridge;

public class ACController extends RemoteController{
    public ACController(AirConditioner airConditioner) {
        super(airConditioner);
    }

    @Override
    public void switchOn() {
        this.airConditioner.turnOn();
    }

    @Override
    public void switchOff() {
        this.airConditioner.turnOff();
    }


}
