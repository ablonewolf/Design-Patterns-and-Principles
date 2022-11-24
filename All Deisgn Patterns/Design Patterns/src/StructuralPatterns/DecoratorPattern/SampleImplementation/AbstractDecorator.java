package StructuralPatterns.DecoratorPattern.SampleImplementation;

public abstract class AbstractDecorator extends Component{
    protected Component component;

    public void setComponent(Component component) {
        this.component = component;
    }

    @Override
    public void doJob() {
        if(this.component !=null) {
            this.component.doJob();
        }
    }
}
