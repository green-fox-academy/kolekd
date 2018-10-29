package GreenFoxOrganisation;

public class Student extends  Person {

    private String previousOrganization;
    private int skippedDays;


    public Student(String name, int age, String gender, String previousOrganization){
        super(name, age, gender);
        this.previousOrganization = previousOrganization;
        skippedDays = 0;
    }

    public  Student (){
        previousOrganization = "The School of Life";
    }


    public void getGoal() {
        System.out.println(rootGoal() + "Be a junior software developer.");
    }

    public void introduce() {
        System.out.println(rootIntroduce() + "from " + previousOrganization +
                            " who skipped " + skippedDays + " days from the course already.");
    }

    public void skipDays(int numberofDays){
        skippedDays += numberofDays;
    }



    }
