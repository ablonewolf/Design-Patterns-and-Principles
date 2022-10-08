package com.arka99.designpatterns.bridge;

public abstract class RemoteController {
    public AirConditioner airConditioner;

    public RemoteController(AirConditioner airConditioner) {
        this.airConditioner = airConditioner;
    }

    public abstract void switchOn();

    public abstract void switchOff();


}
