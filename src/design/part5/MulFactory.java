package design.part5;

public class MulFactory implements Factory {
    @Override
    public Operation createOperation() {
        return new OperationMul();
    }
}
