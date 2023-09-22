package DesignPatterns.StructuralPatterns.AdapterPattern.CalculatorAdapter;

public class Main {
    public static void main(String[] args) {
        System.out.println("Adapter Pattern demo using Area Calculator.");
        System.out.println("*************************");
        System.out.println("*************************");
        System.out.println("*************************");

        Triangle triangle = new Triangle(10,20);
        AreaCalculator calculatorAdaptor = new CalculatorAdapter(triangle);
        System.out.println("Area of the triangle is : " + calculatorAdaptor.getArea(null));

    }
}
