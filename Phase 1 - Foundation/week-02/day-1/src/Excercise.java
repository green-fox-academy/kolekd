import java.util.Scanner;

public class Excercise {
    //  Create the usual class wrapper
    //  and main method on your own.
    // - Write a function called `sum` that sum all the numbers
    //   until the given parameter and returns with an integer
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Give me a number, and I'll give you the total of all numbers between 0 and the number");

        int a = input.nextInt();

        while (a < 0) {

            System.out.println("Please enter a positive number");

            a = input.nextInt();

        }

        System.out.println("The sum of numbers between 0 and " + a + " is: " + sumUntil(a));
    }

    public static int sumUntil(int num) {

        int sum = 0;

        for (int i = 0; i <= num; i++) {

            sum += i;

        }

        return sum;
    }
}