package design.part6.test_1;

public class Main {
    public static void main(String[] args) {
        Resume a = new Resume("Jerry");
        a.setPersonalInfo("男", "23");
        a.setWorkExperience("2019~2021", "XX公司");

        Resume b = a.mClone();
        b.setWorkExperience("2017~2019", "YY公司");

        Resume c = a.mClone();
        c.setPersonalInfo("男", "25");

        a.Display();
        b.Display();
        c.Display();
    }
}
