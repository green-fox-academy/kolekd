public class Sum {
    public static void main(String[] args) {

        //  Create the usual class wrapper
        //  and main method on your own.

        // - Write a function called `sum` that sum all the numbers
        //   until the given parameter and returns with an integer

        int input = 5;
        int result = sum(input);
        System.out.println(result);


    }
    public static int sum(int input) {
        int sum = 0;
        for (int i = 0; i <= input; i++) {
            sum += i;
        }
        return sum;
    }
}
