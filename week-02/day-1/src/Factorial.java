public class Factorial {
    public static void main (String[] args){

        //  Create the usual class wrapper
        //  and main method on your own.

        // - Create a function called `factorio`
        //   that returns it's input's factorial

        int input = 5;
        int result = factorio(input);

        System.out.println(result);


    }
    static int factorio (int input) {
        int sum = input;
        for (int i = input - 1; i != 0; i--) {
            sum *= i;
        }
        return sum;
    }
}
