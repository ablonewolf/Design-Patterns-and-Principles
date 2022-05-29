package com.arka99.designpatterns.singleton;

public enum Database {
    instance;

    public void connect() {
        System.out.println("Connecting to the database");
    }
    public void disconnect() {
        System.out.println("Disconnecting right away.");
    }
}
