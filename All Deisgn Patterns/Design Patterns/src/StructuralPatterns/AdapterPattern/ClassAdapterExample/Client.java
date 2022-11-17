package StructuralPatterns.AdapterPattern.ClassAdapterExample;

public class Client {
    public static void main(String[] args) {
        System.out.println("Class Adapter and Object Adapter demo");
        System.out.println("*************************************");
        System.out.println("*************************************");
        System.out.println("*************************************");
        ClassAdapter classAdapter = new ClassAdapter();
        System.out.println("Class adapter is returning the value : " + classAdapter.getInteger());
        System.out.println("*************************************");
        System.out.println("*************************************");
        System.out.println("*************************************");
        IntegerValueInterface value = new IntegerValue();
        ObjectAdapter objectAdapter = new ObjectAdapter(value);
        System.out.println("Object adapter is returning the value : " + objectAdapter.getInteger());
    }
}
