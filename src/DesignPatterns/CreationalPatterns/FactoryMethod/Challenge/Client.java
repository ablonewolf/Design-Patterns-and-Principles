package DesignPatterns.CreationalPatterns.FactoryMethod.Challenge;

public class Client {
    public static void main(String[] args) {
        Animal animal1 = AnimalFactory.getAnimal("Cat");
        animal1.walk();
        animal1.eat();
        Animal animal2 = AnimalFactory.getAnimal("Dog");
        animal2.walk();
        animal2.eat();
        Animal animal3 = AnimalFactory.getAnimal("Tiger");
        animal3.walk();
        animal3.eat();
    }
}
