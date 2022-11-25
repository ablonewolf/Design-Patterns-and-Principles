package StructuralPatterns.DecoratorPattern.ShapeDecorator;

public abstract class ShapeDecorator implements Shape {
    protected Shape shape;

    public void setShape(Shape shape) {
        this.shape = shape;
    }

    @Override
    public void draw() {
        if(this.shape != null) {
            this.shape.draw();
        }
    }
}
