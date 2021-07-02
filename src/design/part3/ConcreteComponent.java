package design.part3;

public class ConcreteComponent implements Component {
    @Override
    public void Operation() {
        System.out.println("具体成分");
    }
}
