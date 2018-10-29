public class Counter {
    public static void main (String[] args){

    // Write a recursive function that takes one parameter: n and counts down from n.

        System.out.println(counter(5));
    }

    public static int counter (int n){

        if (n == 1){
            return 1;
        } else {
            System.out.println(n);
            return counter(n-1);
        }

    }
}
