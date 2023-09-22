package DesignPatterns.CreationalPatterns.Singleton.BillPughApproach;

public class TestSingleton {
    public static void main(String[] args) {
        Singleton singleton1 = Singleton.getInstance();
        singleton1.setData(15);
        Singleton singleton2 = Singleton.getInstance();
        System.out.println("Data from the first object : " + singleton1.getData());
        System.out.println("Data from the second object : " + singleton2.getData());
        System.out.println("Both objects equal to each other : " + singleton1.equals(singleton2));
    }
}
