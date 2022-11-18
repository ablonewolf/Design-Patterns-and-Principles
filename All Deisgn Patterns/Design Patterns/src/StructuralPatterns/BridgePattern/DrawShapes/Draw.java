package StructuralPatterns.BridgePattern.DrawShapes;

public class Draw {
    public static void main(String[] args) {
        IColor red = new RedColor();
        IColor green = new GreenColor();
        Shape redTriangle = new Triangle(red,15);
        redTriangle.drawShape();
        redTriangle.modifyBorder(3);
        Shape greenRectangle = new Rectangle(green,20);
        greenRectangle.drawShape();
        greenRectangle.modifyBorder(4);
    }
}
