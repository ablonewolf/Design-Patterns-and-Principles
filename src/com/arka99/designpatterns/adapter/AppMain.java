package com.arka99.designpatterns.adapter;

public class AppMain {
    public static void main(String[] args) {
        Animal tiger = new Tiger();
        tiger.run();
        Animal antelope = new Antelope();
        antelope.run();
        Animal snake = new SnakeAdapter(new Snake());
        snake.run();
        Animal mosquitto = new MosquitoAdapter(new Mosquitto());
        mosquitto.run();
    }
}
