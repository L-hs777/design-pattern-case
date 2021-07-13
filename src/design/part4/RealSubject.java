package design.part4;

public class RealSubject implements Subject {
    @Override
    public void Request() {
        System.out.println("真正的请求");
    }
}
