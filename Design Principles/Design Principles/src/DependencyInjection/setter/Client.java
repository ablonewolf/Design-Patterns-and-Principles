package DependencyInjection.setter;

public class Client {
    private Service service;

    public void setService(Service service) {
        this.service = service;
    }

    public void write(String message) {
        this.service.write(message);
    }
}
