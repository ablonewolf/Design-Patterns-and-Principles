package StructuralPatterns.AdapterPattern.TurkeyDuckProblem;

public class WildTurkey implements Turkey{
    @Override
    public void gobble() {
        System.out.println("Gobble Gobble");
    }

    @Override
    public void fly() {
        System.out.println("WildTurkey is flying a short distance");
    }
}
