import java.util.Scanner;

public class GuessTheNumber {
    public static void main(String[] args) {

        // Write a program that stores a number, and the user has to figure it out.
        // The user can input guesses, after each guess the program would tell one
        // of the following:
        //
        // The stored number is higher
        // The stried number is lower
        // You found the number: 8

        Scanner in = new Scanner(System.in);

        System.out.println("What is the stored number?");

        int input;

        do{
        input = in.nextInt();
        if (input == 8){System.out.println("Correct!");}
        else if (input < 8){System.out.println("The stored number is higher.");}
        else if (input > 8){System.out.println("The stored number is lower.");}
        }while (input != 8);
    }
}