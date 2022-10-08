package com.arka99.designpatterns.singleton;

public class DatabaseConnector {

    private static DatabaseConnector instance;

//    a private constructor to prevent the creation of new instances
    private DatabaseConnector() {

    }

    public static DatabaseConnector getInstance() {

        if(instance==null) {
//            making it thread safe and allowing only one instance to be created
            synchronized (DatabaseConnector.class) {
                instance = new DatabaseConnector();
            }
        }
        return instance;
    }

    public void connect() {
        System.out.println("Connectiong to the database");
    }
    public void disconnect() {
        System.out.println("Disconnecting right away.");
    }
}
