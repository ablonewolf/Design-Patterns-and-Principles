package DesignPatterns.CreationalPatterns.Singleton.DoubleCheckedLockingPrinciple;


public class TestSingleton {
    public static void main(String[] args) {
        Singleton s = Singleton.getInstance();
        s.setData(5);
        System.out.println(s.getData());
        Singleton singleton = Singleton.getInstance();
        System.out.println(singleton.getData());
        System.out.println(s);
        System.out.println(singleton);
        System.out.println("Both of the objects true or false : " + singleton.equals(s));
    }
}
