package DesignPatterns.CreationalPatterns.Singleton.DoubleCheckedLockingPrinciple;

// use this approach if you wish to increase your performance, better than the synchronized method
public class Singleton {
//    used volatile so that it's visible and read write is possible from the main memory
    private volatile static Singleton uniqueInstance = null;

    private int data = 0;

    private Singleton() {

    }
//    double check before create a new instance
    public static synchronized Singleton getInstance() {
        if(uniqueInstance == null) {
            synchronized (Singleton.class) {
                if(uniqueInstance == null) {
                    uniqueInstance = new Singleton();
                }
            }
        }
        return uniqueInstance;
    }

    public void setData(int data) {
        this.data = data;
    }

    public int getData() {
        return data;
    }
}
