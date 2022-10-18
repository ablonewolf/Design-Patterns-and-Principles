package CreationalPatterns.FactoryMethod.Challenge;

public class Tiger implements Animal{
    @Override
    public void walk() {
        System.out.println("Tiger is walking.");
    }

    @Override
    public void eat() {
        System.out.println("Tiger is eating.");
    }
}
