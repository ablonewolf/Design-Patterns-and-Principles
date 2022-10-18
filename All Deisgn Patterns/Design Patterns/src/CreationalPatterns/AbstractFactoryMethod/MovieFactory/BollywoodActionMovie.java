package CreationalPatterns.AbstractFactoryMethod.MovieFactory;

public class BollywoodActionMovie implements BollywoodMovie{
    private String name;
    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public String getType() {
        return "Bollywood Action movie";
    }

    @Override
    public void setName(String name) {
        this.name =  name;
    }
}
