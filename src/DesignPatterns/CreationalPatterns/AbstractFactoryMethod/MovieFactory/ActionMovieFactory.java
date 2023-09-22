package DesignPatterns.CreationalPatterns.AbstractFactoryMethod.MovieFactory;

public class ActionMovieFactory extends MovieFactory{
    @Override
    public Movie getMovie(String type) {
        switch (type.toLowerCase()) {
            case "hollywood":
                return new HollywoodActionMovie();
            case "bollywood":
                return new BollywoodActionMovie();
            default:
                return null;
        }
    }
}
