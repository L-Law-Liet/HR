import java.util.ArrayList;

/**
 * Created by 26165 on 27.05.2019.
 */
public class HR {
    private ArrayList<Job> jobs = new ArrayList<>();
    private ArrayList<Candidate> employees = new ArrayList<>();

    public HR(){}
    public HR(ArrayList<Job> jobs, ArrayList<Candidate> employees) {
        this.jobs = jobs;
        this.employees = employees;
    }

    public ArrayList<Job> getJobs() {
        return jobs;
    }

    public void setJobs(ArrayList<Job> jobs) {
        this.jobs = jobs;
    }

    public ArrayList<Candidate> getEmployees() {
        return employees;
    }

    public void setEmployees(ArrayList<Candidate> employees) {
        this.employees = employees;
    }
    public void AddJob(Job job){
        jobs.add(job);
    }
    public void Check(String r, Candidate candidate, int q, int w){
        int sal=-1;
        int xp = -1;
        int j= -1;
        for (int i=0; i<jobs.size(); i++){
            if (r.equals(jobs.get(i).getRole())){
                j=0;
                if(jobs.get(i).getRequiredExperience()<=candidate.getExperience()){
                    xp=0;
                    if (jobs.get(i).getSalary()>=q && jobs.get(i).getSalary()<=w){
                        candidate.setJob(jobs.get(i));
                        employees.add(candidate);
                        System.out.println("Employee added");
                        sal=0;
                        break;
                    }

                }

            }

        }
        if (j!=0){
            System.out.println("Problem with Role of job");
            System.out.println("Employee not added");
        }
        else if (xp!=0){
            System.out.println("Problem with Experience");
            System.out.println("Employee not added");
        }
        else if (sal!=0){
            System.out.println("Problem with Salary");
            System.out.println("Employee not added");
        }
    }
    public void Fire(int key){
        int k=-1;
        for (int i=0; i<employees.size(); i++){
            if (key==employees.get(i).getId()){
                employees.remove(i);
                System.out.println("Removed!");
                k=0;
                break;
            }
        }
        if (k!=0){
            System.out.println("Not removed");
        }
    }
    public void Promote(int key) {
        int k=-1;
        for (int i = 0; i < employees.size(); i++) {
            if (key == employees.get(i).getId()) {
                int XP = employees.get(i).getExperience();
                XP++;
                employees.get(i).setExperience(XP);
                System.out.println("Promoted!");
                k = 0;
                break;
            }
        }
        if (k!=0){
            System.out.println("Not Promoted");
        }
    }
    public void Print(){
        for (int i=0; i<jobs.size(); i++){
            System.out.println("Job #"+(i+1)+" "+jobs.get(i).toString());
        }
        for (int j=0; j<employees.size(); j++){
            System.out.println("Employee #"+(j+1)+" "+employees.get(j).toString());
        }
    }
}
