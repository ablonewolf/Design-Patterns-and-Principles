package StructuralPatterns.AdapterPattern.TurkeyDuckProblem;

public class MallardDuck implements Duck{
    @Override
    public void quack() {
        System.out.println("MallardDuck says : Quack.");
    }

    @Override
    public void fly() {
        System.out.println("MallardDuck is flying.");
    }
}
