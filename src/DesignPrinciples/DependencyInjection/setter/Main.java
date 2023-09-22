package DesignPrinciples.DependencyInjection.setter;

public class Main {
    public static void main(String[] args) {
        Service service = new MainService(); //the injector of the service
        Client client = new Client();
        client.setService(service);
        client.write("This is the setter injection");
    }
}
