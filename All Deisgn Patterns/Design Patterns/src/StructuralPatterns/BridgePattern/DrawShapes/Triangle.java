package StructuralPatterns.BridgePattern.DrawShapes;

public class Triangle extends Shape{
    public Triangle(IColor color, int border) {
        super(color, border);
    }

    @Override
    public int getBorder() {
        return super.getBorder();
    }

    @Override
    public void drawShape() {
        System.out.println("Coloring Triangle");
        System.out.print("This Triangle colored with : ");
        this.color.fillWithColor(this.getBorder());
    }

    @Override
    public void modifyBorder(int border) {
        System.out.println("Now we are changing the border lenght " + border + " times.");
        System.out.print("This Triangle colored with : ");
        this.color.fillWithColor(this.getBorder() * border);
    }
}
