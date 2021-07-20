package design.part6.test_1;

public class Resume implements Cloneable {
    private final String name;
    private String gender;
    private String age;
    private String timeAres;
    private String company;

    public Resume(String name) {
        this.name = name;
    }

    // 个人信息
    public void setPersonalInfo(String gender, String age) {
        this.gender = gender;
        this.age = age;
    }

    // 工作经历
    public void setWorkExperience(String timeAres, String company) {
        this.timeAres = timeAres;
        this.company = company;
    }

    // 显示简历
    public void Display() {
        System.out.println(name + " " + gender + " " + age);
        System.out.println("工作经历：" + timeAres + " " + company);
    }

    // 创建clone方法，浅复制，
    // 如果复制的对象中的某个属性是引用数据类型，则只会复制对象的引用，修改时会改变原始属性
    public Resume mClone() {
        Resume resume = null;
        try {
            resume = (Resume) this.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return resume;
    }
}
