package DesignPatterns.StructuralPatterns.BridgePattern.DrawShapes;

public class GreenColor implements IColor{
    @Override
    public void fillWithColor(int border) {
        System.out.println("Green Color with " + border + " inch border.");
    }
}
