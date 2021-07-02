package design.part3.test;

public class Main {
    public static void main(String[] args) {
        Person xiaoMing = new Person("小明");
        //服饰
        PlaidShirt plaidShirt = new PlaidShirt();
        Jeans jeans = new Jeans();
        Backpack backpack = new Backpack();

        plaidShirt.setPerson(xiaoMing);
        jeans.setPerson(plaidShirt);
        backpack.setPerson(jeans);
        backpack.Show();
    }
}
