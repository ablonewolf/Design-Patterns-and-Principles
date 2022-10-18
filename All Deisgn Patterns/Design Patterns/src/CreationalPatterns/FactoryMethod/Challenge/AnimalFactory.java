package CreationalPatterns.FactoryMethod.Challenge;

public class AnimalFactory {
    public static Animal getAnimal(String animalType) {
        switch (animalType.toLowerCase()) {
            case "cat":
                return new Cat();
            case "dog":
                return new Dog();
            case "tiger":
                return new Tiger();
            default:
                return null;
        }
    }
}
