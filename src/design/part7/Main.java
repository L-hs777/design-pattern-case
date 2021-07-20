package design.part7;

/**
 * Part7: 模版方法模式
 */
public class Main {
    public static void main(String[] args) {
        AbstractClass a;

        a = new ConcreteClassA();
        a.templateMethod();

        a = new ConcreteClassB();
        a.templateMethod();
    }
}
