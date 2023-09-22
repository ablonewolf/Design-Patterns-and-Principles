package DesignPatterns.CreationalPatterns.AbstractFactoryMethod.MovieFactory;

public class ActionMovieFactory extends MovieFactory {
    @Override
    public Movie getMovie(String type) {
        return switch (type.toLowerCase()) {
            case "hollywood" -> new HollywoodActionMovie();
            case "bollywood" -> new BollywoodActionMovie();
            default -> null;
        };
    }
}
