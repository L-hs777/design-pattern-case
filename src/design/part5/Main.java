package design.part5;

/**
 * Part5: 工厂方法模式
 */
public class Main {
    public static void main(String[] args) {
        // 工厂方法
        Factory operFactory = new AddFactory();
        Operation oper = operFactory.createOperation();
        oper.setNumberA(1);
        oper.setNumberB(5);
        double result = oper.getResult();
        System.out.println(result);
    }
}
