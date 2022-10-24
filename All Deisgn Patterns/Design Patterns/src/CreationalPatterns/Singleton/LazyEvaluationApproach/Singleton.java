package CreationalPatterns.Singleton.LazyEvaluationApproach;

// only recommended if you are not worried about multiple threads
public class Singleton {
    private static Singleton uniqueInstance = null;

    private int data = 0;

    private Singleton() {

    }
    public static Singleton getInstance() {
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
