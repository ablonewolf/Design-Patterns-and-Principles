package CreationalPatterns.FactoryMethod.Challenge;

public class Cat implements Animal{
    @Override
    public void walk() {
        System.out.println("Cat is walking.");
    }

    @Override
    public void eat() {
        System.out.println("Cat is eating.");
    }
}
