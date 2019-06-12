/**
 * Created by 26165 on 27.05.2019.
 */
public class Job {
    private int salary;
    private String role;
    private int requiredExperience;
    public Job(){}

    public Job(int salary, String role, int requiredExperience) {
        this.salary = salary;
        this.role = role;
        this.requiredExperience = requiredExperience;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public int getRequiredExperience() {
        return requiredExperience;
    }

    public void setRequiredExperience(int requiredExperience) {
        this.requiredExperience = requiredExperience;
    }

    @Override
    public String toString() {
        return "Job{" +
                "salary=" + salary +
                ", role='" + role + '\'' +
                ", requiredExperience=" + requiredExperience +
                '}';
    }
}
