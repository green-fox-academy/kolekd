public class MainStudent {
    public static void main(String[] args){

        Student john = new Student("John", 20, "male", "BME");

        System.out.println(john);

        john.clone();

        System.out.println(john.clone());
    }
}
