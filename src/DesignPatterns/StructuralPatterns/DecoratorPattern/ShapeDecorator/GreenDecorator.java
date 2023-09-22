package DesignPatterns.StructuralPatterns.DecoratorPattern.ShapeDecorator;

public class GreenDecorator extends ShapeDecorator{
    @Override
    public void draw() {
        super.draw();
        if(super.shape != null) {
            System.out.println("Border : Green.");
        }
    }
}
