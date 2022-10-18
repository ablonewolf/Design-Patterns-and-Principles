package CreationalPatterns.AbstractFactoryMethod.MovieFactory;

public class BollywoodComedyMovie implements BollywoodMovie{
    private String name;
    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String getType() {
        return "Bollywood comedy movie";
    }
}
