package design.part5;

public class SubFactory implements Factory {
    @Override
    public Operation createOperation() {
        return new OperationSub();
    }
}
