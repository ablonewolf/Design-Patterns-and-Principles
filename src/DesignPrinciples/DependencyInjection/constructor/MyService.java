package DesignPrinciples.DependencyInjection.constructor;

public class MyService implements Service{
    @Override
    public void write(String message) {
        System.out.println(message);
    }
}
