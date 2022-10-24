package CreationalPatterns.Singleton.SynchronizedMethod;

// use this approach is performance is not an issue
public class Singleton {
    private static Singleton uniqueInstance = null;

    private int data = 0;

    private Singleton() {

    }
//    used synchronized to make the getInstance method thread-safe
    public static synchronized Singleton getInstance() {
        if(uniqueInstance == null) {
            uniqueInstance = new Singleton();
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

