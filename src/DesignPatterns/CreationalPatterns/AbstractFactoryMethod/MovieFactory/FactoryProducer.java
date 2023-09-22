package DesignPatterns.CreationalPatterns.AbstractFactoryMethod.MovieFactory;

public class FactoryProducer {
    public static MovieFactory getMovieFactory(String genre) {
        return switch (genre.toLowerCase()) {
            case "comedy" -> new ComedyMovieFactory();
            case "action" -> new ActionMovieFactory();
            default -> null;
        };
    }
}
