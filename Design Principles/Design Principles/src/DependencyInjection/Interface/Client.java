package DependencyInjection.Interface;

public class Client implements SetService{
    private Service service;
    @Override
    public void setService(Service service) {
        this.service = service;
    }
    public void write(String message) {
        this.service.write(message);
    }
}
