package DesignPrinciples.DependencyInjection.constructor;

public class Client {
    private Service service;

    public Client(Service service) {
        this.service = service;
    }

    public void serviceOperation(String message) {
        this.service.write(message);
    }
}
