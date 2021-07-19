package design.part6;

public abstract class Prototype {
    private final String id;

    public Prototype(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }

    // clone方法，根据自身创建另外一个可定制对象
    public abstract Prototype mClone();
}
