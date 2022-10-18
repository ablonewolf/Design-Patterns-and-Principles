package CreationalPatterns.AbstractFactoryMethod.MovieFactory;

public class FactoryProducer {
    public static MovieFactory getMovieFactory(String genre) {
        switch (genre.toLowerCase()) {
            case "comedy":
                return new ComedyMovieFactory();
            case "action":
                return new ActionMovieFactory();
            default:
                return null;
        }
    }
}
