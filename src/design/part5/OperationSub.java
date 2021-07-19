package design.part5;

public class OperationSub extends Operation {

    @Override
    public double getResult() {
        double result = 0;
        result = getNumberA() - getNumberB();
        return result;
    }
}
