package design.part1;

public class OperationMul extends Operation {
    @Override
    public double GetResult() {
        double result = 0;
        result = getNumberA() * getNumberB();
        return result;
    }
}
