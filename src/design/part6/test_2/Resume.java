package design.part6.test_2;

public class Resume implements Cloneable {
    private final String name;
    private String gender;
    private String age;
    private WorkExperience work;

    public Resume(String name) {
        this.name = name;
        this.work = new WorkExperience();
    }

    // 个人信息
    public void setPersonalInfo(String gender, String age) {
        this.gender = gender;
        this.age = age;
    }

    // 工作经历
    public void setWorkExperience(String timeAres, String company) {
        this.work.setWorkDate(timeAres);
        this.work.setCompany(company);
    }

    // 显示简历
    public void Display() {
        System.out.println(name + " " + gender + " " + age);
        System.out.println("工作经历：" + work.getWorkDate() + " " + work.getCompany());
    }

    // 创建clone方法，深拷贝，
    public Resume mClone() {
        Resume resume = null;
        try {
            resume = (Resume) this.clone();
            // 调用对象中的clone方法，进行深度拷贝
            resume.work = work.mClone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return resume;
    }
}
