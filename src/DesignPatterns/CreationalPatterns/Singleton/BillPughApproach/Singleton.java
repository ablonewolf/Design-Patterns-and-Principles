package DesignPatterns.CreationalPatterns.Singleton.BillPughApproach;

// The most recommended one, unlike the eager approach, it creates an instance when client needs one and thread-safe
public class Singleton {
    private int data;

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }
//    private constructor, so no client gets to initialize it directly
    private Singleton() {

    }
    private static class SingletonHelper {
        private static final Singleton uniqueInstance = new Singleton();
    }
//    SingletonHelper is only initialized when getInstance method is called
    public static Singleton getInstance() {
        return SingletonHelper.uniqueInstance;
    }
}
