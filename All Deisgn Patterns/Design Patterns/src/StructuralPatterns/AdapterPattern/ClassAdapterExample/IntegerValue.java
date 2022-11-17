package StructuralPatterns.AdapterPattern.ClassAdapterExample;

public class IntegerValue implements IntegerValueInterface{
    @Override
    public int getInteger() {
        return 5;
    }
}
