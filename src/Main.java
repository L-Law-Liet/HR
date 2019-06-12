import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner L = new Scanner(System.in);
        HR hr = new HR();
        int ch = -1;
        while(ch!=0){
            System.out.println("1.Add Job");
            System.out.println("2.Add Employee");
            System.out.println("3.Fire");
            System.out.println("4.Provide");
            System.out.println("5.Print information");
            System.out.println("0.Exit");
            ch = L.nextInt();
        switch(ch){
            case 1:
                Job job = new Job();
                System.out.println("Salary:");
                job.setSalary(L.nextInt());
                System.out.println("Role:");
                job.setRole(L.next());
                System.out.println("Required Exp:");
                job.setRequiredExperience(L.nextInt());
                hr.AddJob(job);
                break;

            case 2:
                Candidate candidate = new Candidate();
                System.out.println("ID:");
                candidate.setId(L.nextInt());
                System.out.println("Name:");
                candidate.setName(L.next());
                System.out.println("Surname:");
                candidate.setSurname(L.next());
                System.out.println("Experience");
                candidate.setExperience(L.nextInt());
                int [] a = new int[2];
                System.out.println("Minimum salary");
              a[0]=L.nextInt();
                System.out.println("Maximum salary");
                a[1]=L.nextInt();
                candidate.setExpectedSalary(a);
                System.out.println("Role of Employee:");
                String r = L.next();
                hr.Check(r,candidate,a[0],a[1]);
                break;
            case 3:
                System.out.println("Input ID:");
                int key=L.nextInt();
                hr.Fire(key);
                break;
            case 4:
                System.out.println("Input ID:");
                int kay=L.nextInt();
                hr.Promote(kay);
                break;
            case 5:
                hr.Print();
                break;
        }
        }
        System.out.println("GG");
    }
}
