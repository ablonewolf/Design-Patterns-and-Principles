package programmingToAnInterface;

public class Computer {
    DisplayModule displayModule;

    public void setDisplayModule(DisplayModule displayModule) {
        this.displayModule = displayModule;
    }
    public void display() {
        displayModule.display();
    }
}
