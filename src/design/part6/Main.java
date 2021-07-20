package design.part6;

/**
 * Part6: 原型模式
 */
public class Main {
    public static void main(String[] args) {
        ConcretePrototype p1 = new ConcretePrototype("T");
        ConcretePrototype c1 = (ConcretePrototype) p1.mClone();
        System.out.println("cloned id: " + c1.getId());
    }
}
