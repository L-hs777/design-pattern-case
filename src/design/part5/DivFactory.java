package design.part5;

public class DivFactory implements Factory {
    @Override
    public Operation createOperation() {
        return new OperationDiv();
    }
}
