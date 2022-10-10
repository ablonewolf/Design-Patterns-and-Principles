package InterfaceSegregationPrinciple;

public class Main {
    public static void main(String[] args) {
        Shape square = new Square();
        Shape cube = new Cube();
        ((Square) square).setLength(5);
        ((Cube) cube).setLength(5);
        System.out.println("Area of the square : " + square.getArea());
        System.out.println("Area of the cube : " + cube.getArea() + " and Volume of the cube : " + ((Cube) cube).getVolume());
    }
}
