package design.part5;

public class AddFactory implements Factory {
    @Override
    public Operation createOperation() {
        return new OperationAdd();
    }
}
