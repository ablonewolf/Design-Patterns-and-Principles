package com.arka99.designpatterns.singleton;


public class AppMain {
    public static void main(String[] args) {
        DatabaseConnector databaseConnector1 = DatabaseConnector.getInstance();
        DatabaseConnector databaseConnector2 = DatabaseConnector.getInstance();

        if(databaseConnector1==databaseConnector2) {
            System.out.println("Same object has been created.");
        }

        else {
            System.out.println("They are different objects");
        }

        Database database1 = Database.instance;
        Database database2 = Database.instance;

        if(database1==database2) {
            System.out.println("Both databases are same instances.");
        }

        else {
            System.out.println("Different instances of database have been created.");
        }
    }
}
