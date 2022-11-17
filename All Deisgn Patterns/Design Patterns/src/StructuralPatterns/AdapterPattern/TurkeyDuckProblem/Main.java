package StructuralPatterns.AdapterPattern.TurkeyDuckProblem;

public class Main {
    public static void main(String[] args) {
        Duck mallardDuck = new MallardDuck();
        Turkey wildTurkey = new WildTurkey();

//        Calling the Turkey adapter to act like a duck
        Duck turkeyAdapter = new TurkeyAdapter(wildTurkey);
        System.out.println("Turkey says .....");
        wildTurkey.gobble();
        wildTurkey.fly();
        System.out.println("The Duck says ....");
        testDuck(mallardDuck);
        System.out.println("The Turkey looked like a duck says ....");
        testDuck(turkeyAdapter);

    }
    static void testDuck(Duck duck) {
        duck.quack();
        duck.fly();
    }
}
