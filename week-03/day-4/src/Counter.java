public class Counter {
    public static void main (String[] args){

        // Write a recursive function that takes one parameter: n and counts down from n.

        System.out.println(counter(5));

    }

    public static int counter (int n){

        int factorial = n;
        for (int i = 1; i < n; i++) {
            System.out.println(factorial);
            factorial-=1;
        }
        return factorial;
    }

}