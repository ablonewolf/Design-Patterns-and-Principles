package DesignPatterns.CreationalPatterns.AbstractFactoryMethod.MovieFactory;

public class HollywoodComedyMovie implements HollywoodMovie{
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
        return "Hollywood Comedy Movie";
    }
}
