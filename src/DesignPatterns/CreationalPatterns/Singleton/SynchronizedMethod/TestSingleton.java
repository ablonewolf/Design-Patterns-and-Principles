package DesignPatterns.CreationalPatterns.Singleton.SynchronizedMethod;

public class TestSingleton {
    public static void main(String[] args) {
        Singleton s = Singleton.getInstance();
        s.setData(5);
        System.out.println(s.getData());
        Singleton singleton = Singleton.getInstance();
        System.out.println(singleton.getData());
        System.out.println(s);
        System.out.println(singleton);
    }
}
