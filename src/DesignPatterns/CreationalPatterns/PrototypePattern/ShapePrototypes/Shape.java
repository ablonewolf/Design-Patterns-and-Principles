package DesignPatterns.CreationalPatterns.PrototypePattern.ShapePrototypes;

public abstract class Shape implements Cloneable {
    private String id;
    protected String type;

    abstract void draw();

    public String getId() {
        return id;
    }

    public String getType() {
        return type;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Override
    public Object clone()  {
        Object clone = null;
        try{
            clone = super.clone();
        }
        catch (CloneNotSupportedException e) {
            System.out.println("You cannot clone objects from this class " + this.getClass().toString());
        }
        return clone;
    }
}
