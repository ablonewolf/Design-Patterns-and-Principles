package DesignPatterns.CreationalPatterns.PrototypePattern.ShapePrototypes;

import java.util.Hashtable;

public class ShapeCache {
    private static Hashtable<String,Shape> shapeTable = new Hashtable<>();

    public static Shape getShape(String shapeID) {
        Shape cachedShape = shapeTable.get(shapeID);
        return (Shape) cachedShape.clone();
    }

    public static void loadCache() {
        Circle circle = new Circle();
        circle.setId("1");
        shapeTable.put(circle.getId(),circle);

        Square square = new Square();
        square.setId("2");
        shapeTable.put(square.getId(),square);

        Rectangle rectangle = new Rectangle();
        rectangle.setId("3");
        shapeTable.put(rectangle.getId(),rectangle);
    }
}
