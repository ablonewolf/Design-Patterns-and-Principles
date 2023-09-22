package DesignPatterns.CreationalPatterns.AbstractFactoryMethod.MovieFactory;

public class ComedyMovieFactory extends MovieFactory {
    @Override
    public Movie getMovie(String type) {
        return switch (type.toLowerCase()) {
            case "hollywood" -> new HollywoodComedyMovie();
            case "bollywood" -> new BollywoodComedyMovie();
            default -> null;
        };

    }
}
