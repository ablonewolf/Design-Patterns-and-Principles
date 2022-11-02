package CreationalPatterns.BuilderPattern.MealBuilder;

public abstract class Burger implements Item {
    Wrapper wrapper = new Wrapper();
    @Override
    public String getPacking() {
        return this.wrapper.getPacking();
    }
}
