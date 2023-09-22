package DesignPatterns.CreationalPatterns.FactoryMethod.StaticMethodCreator;



public class ShapeFactory {
    public static Shape getShape(String shapeType) {
        switch (shapeType.toLowerCase()) {
            case "circle" :
                return new Circle();
            case "square" :
                return new Square();
            case "rectangle" :
                return new Rectangle();
            default :
                return null;
        }
    }
    }

