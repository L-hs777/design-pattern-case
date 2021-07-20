package design.part6.test_2;

public class WorkExperience implements Cloneable {
    private String workDate;
    private String company;

    public String getWorkDate() {
        return workDate;
    }

    public void setWorkDate(String workDate) {
        this.workDate = workDate;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public WorkExperience mClone() {
        WorkExperience works = null;
        try {
            works = (WorkExperience) this.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return works;
    }
}
