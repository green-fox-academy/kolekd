import java.util.Scanner;

public class Factorial {
    public static void main (String[] args) {

        //  Create the usual class wrapper
        //  and main method on your own.

        // - Create a function called `factorio`
        //   that returns it's input's factorial

        Scanner in = new Scanner(System.in);

        int input = in.nextInt();
        int result = process(input);
        System.out.print(result);

    }
    public static int process (int input){
        int sum = 0;
        for (int i = 0; i < input; i++) {
            sum *= i;
            System.out.print(sum);
        }
        return sum;
    }
}
