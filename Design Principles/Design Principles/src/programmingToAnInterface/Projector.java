package programmingToAnInterface;

public class Projector implements DisplayModule{
    @Override
    public void display() {
        System.out.println("Display through projector.");
    }
}
