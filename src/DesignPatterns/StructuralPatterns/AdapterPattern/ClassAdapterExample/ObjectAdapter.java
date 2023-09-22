package DesignPatterns.StructuralPatterns.AdapterPattern.ClassAdapterExample;

public class ObjectAdapter {
    private IntegerValueInterface valueInterface;

    public ObjectAdapter(IntegerValueInterface valueInterface) {
        this.valueInterface = valueInterface;
    }

    public int getInteger() {
       return valueInterface.getInteger();
    }
}
