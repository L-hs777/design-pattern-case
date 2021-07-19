package design.part6;

public class ConcretePrototype extends Prototype implements Cloneable {
    public ConcretePrototype(String id) {
        super(id);
    }

    // 进行浅克隆
    @Override
    public Prototype mClone() {
        Prototype prototype = null;
        try {
            prototype = (Prototype) this.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return prototype;
    }
}
