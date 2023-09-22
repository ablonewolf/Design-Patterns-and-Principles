package DesignPatterns.CreationalPatterns.Singleton.EagerEvaluationApproach;

// if application does not use a lot of resources and always initiates a new instance then this one
public class Singleton {
    private static Singleton uniqueInstace = new Singleton();
    private int number;

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    private Singleton() {

    }
//    create a static instance whenever the class is loaded, so by default thread-safe
    public static Singleton getInstance() {
        return uniqueInstace;
    }
}
