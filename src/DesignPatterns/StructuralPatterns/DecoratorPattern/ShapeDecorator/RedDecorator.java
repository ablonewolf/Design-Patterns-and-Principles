package DesignPatterns.StructuralPatterns.DecoratorPattern.ShapeDecorator;

public class RedDecorator extends ShapeDecorator{
    @Override
    public void draw() {
        super.draw();
        if(super.shape != null) {
            System.out.println("Border : Red.");
        }
    }
}
