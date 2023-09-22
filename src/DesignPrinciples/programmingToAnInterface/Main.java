package DesignPrinciples.programmingToAnInterface;

public class Main {
    public static void main(String[] args) {
        Computer computer = new Computer();
        DisplayModule module = new Monitor();
        DisplayModule module1 = new Projector();

        computer.setDisplayModule(module);
        computer.display();
        computer.setDisplayModule(module1);
        computer.display();
    }
}
