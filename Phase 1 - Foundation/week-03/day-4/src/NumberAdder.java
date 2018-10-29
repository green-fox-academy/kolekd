public class NumberAdder {
    public static void main (String[] args){

    // Write a recursive function that takes one parameter: n and adds numbers from 1 to n.

        System.out.println(add(5));
    }

    public static int add (int n){

        if (n == 1){
            return 1;
        } else {
            return n+add(n-1);
        }

    }
}
