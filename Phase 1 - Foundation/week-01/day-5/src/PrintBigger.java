import java.util.Scanner;

public class PrintBigger {
    public static void main(String[] args) {
        // Write a program that asks for two numbers and prints the bigger one

        Scanner in = new Scanner(System.in);

        System.out.println("Think of two numbers.");
        System.out.println("Press <enter> to proceed.");
        in.nextLine();

        System.out.println("Please input the first number.");
        int input = in.nextInt();

        System.out.println("Please input the second number.");
        int input2 = in.nextInt();

        if (input > input2) System.out.println(input + " is the bigger number.");
        else System.out.println(input2 + " is the bigger number.");




    }
}