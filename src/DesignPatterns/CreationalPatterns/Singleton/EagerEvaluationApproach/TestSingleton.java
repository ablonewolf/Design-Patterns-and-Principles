package DesignPatterns.CreationalPatterns.Singleton.EagerEvaluationApproach;

public class TestSingleton {
    public static void main(String[] args) {
        Singleton singleton1 = Singleton.getInstance();
        singleton1.setNumber(10);
        Singleton singleton2 = Singleton.getInstance();
        System.out.println(singleton2.getNumber());
        System.out.println(singleton1.getNumber());
        System.out.println("Both object are same? True or False : " + singleton1.equals(singleton2));

    }
}
