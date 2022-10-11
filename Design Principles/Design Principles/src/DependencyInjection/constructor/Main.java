package DependencyInjection.constructor;

public class Main {
    public static void main(String[] args) {
        Service service = new MyService(); // this is the injector of the service
        Client client = new Client(service); // injecting via the constructor
        client.serviceOperation("This is a simple dependency injection");
    }
}
