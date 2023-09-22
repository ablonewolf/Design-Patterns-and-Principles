package DesignPatterns.CreationalPatterns.BuilderPattern.VehicleBuilder;

public class Director {
    private BuilderInterface builder;
    public void construct(BuilderInterface myBuilder) {
        this.builder = myBuilder;
        this.builder.buildBody();
        this.builder.insertWheels();
        this.builder.addHeadlights();
    }
}
