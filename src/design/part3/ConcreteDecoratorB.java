package design.part3;

public class ConcreteDecoratorB extends Decorator {
    private void AddedBehavior() {
        System.out.println("\t\t装饰B中特有的方法");
    }

    @Override
    public void Operation() {
        super.Operation();
        AddedBehavior();
        System.out.println("装饰B");
    }
}
