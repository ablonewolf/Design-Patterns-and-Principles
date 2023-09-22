package DesignPatterns.CreationalPatterns.AbstractFactoryMethod.MovieFactory;

public class ComedyMovieFactory extends MovieFactory{
    @Override
    public Movie getMovie(String type) {
        switch (type.toLowerCase()) {
            case "hollywood" :
                return new HollywoodComedyMovie();
            case "bollywood" :
                return new BollywoodComedyMovie();
            default:
                return null;
        }

    }
}
