package StructuralPatterns.DecoratorPattern.SampleImplementation;

public class ConcreteComponent extends Component{
    @Override
    public void doJob() {
        System.out.println("This method is invoked from Concrete Component");
    }
}
