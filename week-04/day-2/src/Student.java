public class Student implements Cloneable {

    private String name;
    private int age;
    private String gender;
    private String previousOrganization;
    private int skippedDays;


    public Student(String name, int age, String gender, String previousOrganization) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.previousOrganization = previousOrganization;
        skippedDays = 0;
    }

    public Student clone() {
        return new Student(name, age, gender, previousOrganization);
    }

    @Override
    public String toString() {
        return name + " " + age + " " + gender + " " + previousOrganization;
    }
}