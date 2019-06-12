import java.util.Arrays;

/**
 * Created by 26165 on 27.05.2019.
 */
public class Candidate {
    private int id;
    private String name;
    private String surname;
    private int experience;
    private int [] expectedSalary;
    private Job job;
    public Candidate(){}

    public Candidate(int id, String name, String surname, int experience, int[] expectedSalary, Job job) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.experience = experience;
        this.expectedSalary = expectedSalary;
        this.job = job;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getExperience() {
        return experience;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }

    public int[] getExpectedSalary() {
        return expectedSalary;
    }

    public void setExpectedSalary(int[] expectedSalary) {
        this.expectedSalary = expectedSalary;
    }

    public Job getJob() {
        return job;
    }

    public void setJob(Job job) {
        this.job = job;
    }

    @Override
    public String toString() {
        return "Candidate{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", experience=" + experience +
                ", expectedSalary=" + Arrays.toString(expectedSalary) +
                ", job=" + job +
                '}';
    }
}
