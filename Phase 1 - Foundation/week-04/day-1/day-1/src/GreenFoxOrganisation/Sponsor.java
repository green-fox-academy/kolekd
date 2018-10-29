package GreenFoxOrganisation;

public class Sponsor extends Person{

    private String company;
    private int hiredStudents;


    public void introduce(){
        System.out.println(rootIntroduce() + "who represents " + company + " and hired " + hiredStudents + " so far.");
    }

    public void getGoal(){
        System.out.println(rootGoal() + "Hire brilliant junior software developers.");
    }

    public void hire(){
        hiredStudents ++;
    }


    public Sponsor (String name, int age, String gender, String company){
        super(name, age, gender);
        hiredStudents = 0;
    }

    public Sponsor(){
        company = "Google";
        hiredStudents = 0;
    }


}
