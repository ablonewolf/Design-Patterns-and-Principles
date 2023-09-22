package DesignPrinciples.DependencyInjection.Interface;

public class NewService implements Service{
    @Override
    public void write(String message) {
        System.out.println(message);
    }
}
