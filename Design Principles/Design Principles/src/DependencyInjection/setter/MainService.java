package DependencyInjection.setter;

public class MainService implements Service{
    @Override
    public void write(String message) {
        System.out.println(message);
    }
}
