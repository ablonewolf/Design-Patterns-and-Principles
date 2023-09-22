package DesignPrinciples.DependencyInjection.Interface;

public class Main {
    public static void main(String[] args) {
        Client client = new Client();
        Service service = new NewService(); // setting up the injector
        client.setService(service); //injecting the dependency
        client.write("This is interface injection");
    }
}
