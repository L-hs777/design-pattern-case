package design.part3.test;

public class Person implements Component {
    private String name;

    public Person(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void Show() {
        System.out.print(getName() + "的装扮: ");
    }
}
