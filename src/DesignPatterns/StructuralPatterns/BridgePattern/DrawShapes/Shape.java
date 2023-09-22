package DesignPatterns.StructuralPatterns.BridgePattern.DrawShapes;

abstract public class Shape {
    protected IColor color;
    private int border;

    public Shape(IColor color,int border) {
        this.color = color;
        this.border = border;
    }

    public int getBorder() {
        return border;
    }

    abstract public void drawShape();
    abstract public void modifyBorder(int border);
}
