package DesignPatterns.CreationalPatterns.PrototypePattern.CarPrototypes;

public abstract class BasicCar implements Cloneable {
    protected void setModelName(String modelName) {
        this.modelName = modelName;
    }

    private String modelName;
    private float price;

    private String color;

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public abstract void buildCar();

    public String getModelName() {
        return modelName;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    @Override
    protected BasicCar clone()  {
        Object clone = null;
        try {
            clone = super.clone();
        }
        catch (CloneNotSupportedException e) {
            System.out.println("This class cannot be cloned : " + this.getClass().toString());
        }
        return (BasicCar) clone;
    }
}
