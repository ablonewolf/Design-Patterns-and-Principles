package CreationalPatterns.AbstractFactoryMethod.MovieFactory;

public class Client {
    public static void main(String[] args) {
        MovieFactory comedyMovieFactory = FactoryProducer.getMovieFactory("Comedy");
        Movie deDanaDan = comedyMovieFactory.getMovie("bollywood");
        deDanaDan.setName("De Dana Dan");
        System.out.println("Movie Name : " + deDanaDan.getName() + "\n" + "Movie Type : " + deDanaDan.getType());
        System.out.println("========================");
        Movie jumanzi = comedyMovieFactory.getMovie("hollywood");
        jumanzi.setName("Jumanzi");
        System.out.println("Movie Name : " + jumanzi.getName() + "\n" + "Movie Type : " + jumanzi.getType());
        System.out.println("========================");
        MovieFactory actionMovieFactory = FactoryProducer.getMovieFactory("Action");
        Movie sholay = actionMovieFactory.getMovie("bollywood");
        sholay.setName("Sholay");
        System.out.println("Movie Name : " + sholay.getName() + "\n" + "Movie Type : " + sholay.getType());
        System.out.println("========================");
        Movie endgame = actionMovieFactory.getMovie("hollywood");
        endgame.setName("Endgame");
        System.out.println("Movie Name : " + endgame.getName() + "\n" + "Movie Type : " + endgame.getType());
        System.out.println("========================");
    }
}
