package DesignPatterns.StructuralPatterns.BridgePattern.DrawShapes;

public class Rectangle extends Shape{
    public Rectangle(IColor color,int border) {
        super(color,border);
    }

    @Override
    public int getBorder() {
        return super.getBorder();
    }

    @Override
    public void drawShape() {
        System.out.println("Coloring Rectangle:");
        System.out.print("This Rectangle colored with : ");
        this.color.fillWithColor(this.getBorder());
    }

    @Override
    public void modifyBorder(int border) {
        System.out.println("Now we are changing the border " + border + " times.");
        System.out.print("This Rectangle colored with : ");
        this.color.fillWithColor(this.getBorder() * border);
    }
}
