package design.part3;

public class ConcreteDecoratorA extends Decorator {
    private String addedState;

    @Override
    public void Operation() {
        super.Operation();
        addedState = "New State";
        System.out.println("装饰A" + "\taddedState：" + addedState);
    }
}
