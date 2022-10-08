package com.arka99.designpatterns.adapter;

public class MosquitoAdapter implements Animal{
    public Mosquitto mosquitto;

    public MosquitoAdapter(Mosquitto mosquitto) {
        this.mosquitto = mosquitto;
    }

    @Override
    public void run() {
        this.mosquitto.fly();
    }
}
